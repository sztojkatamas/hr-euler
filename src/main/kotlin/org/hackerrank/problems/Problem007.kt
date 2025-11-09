package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem007(testing: Boolean = false) : BaseChallenge("problem007", testing) {
    val primes = mutableListOf<Int>()
    override fun main(args: Array<String>) {
        val t = readln().trim().toInt()
        producePrimes(10000)
        repeat(t) {
            val n = readln().trim().toInt()
            println(primes[n-1])
        }
    }

    private fun producePrimes(numberOfPrimes: Int) {
        var actual = 1
        primes.add(2)
        for (i in 3..105000 step 2) { // Max bound is 10_000th prime and it is 104_729
            if(checkIfPrime(i)) {
                primes.add(i)
                actual++
                if (actual == numberOfPrimes) { return }
            }
        }
    }

    private fun checkIfPrime(num: Int) : Boolean {
        for (i in 2..(Math.sqrt(num.toDouble()).toInt()+1)) {
            if (num%i==0) {
                return false
            }
        }
        return true
    }

}