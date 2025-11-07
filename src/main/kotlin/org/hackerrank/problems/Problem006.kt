package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem006(testing: Boolean = false) : BaseChallenge("problem006", testing) {

    override fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()
        repeat(t) {
            val n = readLine()!!.trim().toLong()
            val sumSquare = getSumOfSquares(n)
            val squareSum = getSquareOfSum(n)
            if (sumSquare > squareSum) {
                println(sumSquare - squareSum)
            } else {
                println(squareSum - sumSquare)
            }
        }
    }

    private fun getSumOfSquares(limit: Long) : Long {
        var sum = 0L
        repeat(limit.toInt() + 1) {
            sum += (it * it)
        }
        return sum
    }

    private fun getSquareOfSum(limit: Long) : Long {
        var sum = 0L
        repeat(limit.toInt() + 1) {
            sum += it
        }
        return sum * sum
    }

}