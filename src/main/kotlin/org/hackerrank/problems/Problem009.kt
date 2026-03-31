package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem009(testing: Boolean = false) : BaseChallenge("problem009", testing) {
    override fun main(args: Array<String>) {
        val t = readln().trim().toInt()
        repeat(t) {
            val n = readLine()!!.trim().toInt()
            println(maxProductPythagoreanTriplet(n).product)
        }

    }

    data class Triplet(val a: Int, val b: Int, val c: Int) {
        val product: Long get() = 1L * a * b * c
    }

    fun maxProductPythagoreanTriplet(sum: Int): Triplet {
        if (sum <= 0 || sum % 2 != 0) return Triplet(-1,-1,-1)

        var best: Triplet = Triplet(-1,-1,-1)
        var bestProduct = -1L

        val maxM = kotlin.math.sqrt((sum / 2).toDouble()).toInt()

        for (m in 2..maxM) {
            for (n in 1 until m) {
                val divisor = 2 * m * (m + n)
                if (sum % divisor != 0) continue

                val k = sum / divisor

                val x = k * (m * m - n * n)
                val y = k * (2 * m * n)
                val c = k * (m * m + n * n)

                val a = minOf(x, y)
                val b = maxOf(x, y)

                val product = 1L * a * b * c
                if (product > bestProduct) {
                    bestProduct = product
                    best = Triplet(a, b, c)
                }
            }
        }

        return best
    }


}