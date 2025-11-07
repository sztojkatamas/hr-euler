package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem001 : BaseChallenge("problem001") {

    override fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()

        repeat(t) {
            val n = readLine()!!.trim().toLong()
            println(sumOfMultiples(n))
        }
    }

    private fun sumOfMultiples(n: Long): Long {
        fun sumDivisibleBy(k: Long): Long {
            val p = (n - 1) / k
            return k * p * (p + 1) / 2
        }
        return sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15)
    }
}