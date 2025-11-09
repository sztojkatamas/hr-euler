package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem004(testing: Boolean = false) : BaseChallenge("problem004", testing) {

    override fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()

        // Precompute once: all palindromes = a*b with a,b in 100..999 and < 1_000_000
        val pals = precomputedPalindromes()

        repeat(t) {
            val n =readLine()!!.trim().toInt()
            println(largestPalindromeLessThan(n, pals))
        }
    }

    private fun precomputedPalindromes(): IntArray {
        val set = HashSet<Int>(1024)
        for (a in 999 downTo 100) {
            for (b in a downTo 100) { // a*b == b*a; avoid duplicates
                val p = a * b
                if (p >= 1_000_000) continue
                if (p < 101_101) break // products only get smaller as b decreases
                if (isPalindrome(p)) set.add(p)
            }
        }
        val arr = set.toIntArray()
        arr.sort()
        return arr
    }

    private fun largestPalindromeLessThan(n: Int, pals: IntArray): Int {
        // We need strictly < n
        val idx = pals.binarySearch(n)
        return if (idx >= 0) {
            // n itself is a palindrome; take the previous one
            if (idx == 0) 0 else pals[idx - 1]
        } else {
            // insertion point of n; predecessor is at (ip - 1)
            val ip = -idx - 1
            if (ip <= 0) 0 else pals[ip - 1]
        }
    }

    private fun isPalindrome(x: Int): Boolean {
        val s = x.toString()
        return s == s.reversed()
    }
}