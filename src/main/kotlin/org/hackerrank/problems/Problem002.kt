package org.hackerrank.problems

import org.hackerrank.BaseChallenge
import org.hackerrank.EulerChallenge

@EulerChallenge
class Problem002 : BaseChallenge("problem002") {

    val fibonacci = mutableListOf<Long>()

    override fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()
        val listOfNumbers = mutableListOf<Long>()

        repeat(t) {
            val n = readLine()!!.trim().toLong()
            listOfNumbers.add(n)
        }
        createFibonacci(listOfNumbers.max())

        listOfNumbers.forEach { o -> println(fibonacci.filter { it<o }.filter { it%2==0L }.sum()) }
    }

    private fun createFibonacci(limit: Long) {
        fibonacci.add(1L)
        fibonacci.add(2L)

        var index = 1
        while ((fibonacci[index-1] + fibonacci[index]) <= limit) {
            fibonacci.add(fibonacci[index-1] + fibonacci[index])
            index++
        }
    }
}