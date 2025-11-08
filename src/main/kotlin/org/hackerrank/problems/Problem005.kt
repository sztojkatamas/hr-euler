package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem005(testing: Boolean = false) : BaseChallenge("problem005", testing) {

    override fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()
        repeat(t) {
            val n = readLine()!!.trim().toInt()
            println(getSmallestMultiple(n))
        }
    }

    private tailrec fun gcd(a: Long, b: Long): Long =
        if (b == 0L) kotlin.math.abs(a) else gcd(b, a % b)

    private fun lcm(a: Long, b: Long): Long = a / gcd(a, b) * b

    private fun getSmallestMultiple(num : Int) : Long =
        (1..num).fold(1L) { acc, x -> lcm(acc, x.toLong()) }
}