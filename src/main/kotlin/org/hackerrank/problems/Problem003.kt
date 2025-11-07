package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem003 : BaseChallenge("problem003") {

    override fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()
        repeat(t) {
            val n = readLine()!!.trim().toLong()
            println(largestPrimeFactor(n))
        }
    }

    private fun largestPrimeFactor(n0: Long): Long {
        var n = n0
        var largest = 1L

        // Handle even factors first
        while (n % 2L == 0L) {
            largest = 2L
            n /= 2L
        }

        var f = 3L
        val limit = Math.sqrt(n.toDouble()).toLong() + 1

        while (f <= limit && n > 1) {
            while (n % f == 0L) {
                largest = f
                n /= f
            }
            f += 2
        }

        // If remainder > 1, it's a prime factor larger than sqrt(original n)
        if (n > 1) largest = n

        return largest
    }
}