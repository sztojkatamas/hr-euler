package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem008(testing: Boolean = false) : BaseChallenge("problem008", testing) {

    override fun main(args: Array<String>) {
        val numOfTests = readLine()!!.trim().toInt()

        for (tItr in 1..numOfTests) {
            val numbers = readLine()!!.trimEnd().split(" ")

            val n = numbers[0].toInt()
            val k = numbers[1].toInt()
            val num = readLine()!!.take(n)

            val bucket = mutableSetOf<Int>()
            var w = num.windowed(k,1, partialWindows = false)
            w.forEach {
                bucket.add(getProduct(it, k))
            }
            println(bucket.max())
        }
    }

    fun getProduct(number: String, k: Int): Int {
        var product = 1
        repeat(k) {
            product *= number[it].digitToInt()
        }
        return product
    }
}