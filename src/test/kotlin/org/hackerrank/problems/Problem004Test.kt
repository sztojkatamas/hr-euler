package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem004Test : TestBase() {

    @Test
    fun `Largest palindrome product test`() {
        setupInAndOutput("3\n101110\n800000\n906999\n", "101101\n793397\n906609")
        Problem004(true).main(arrayOf())
        check()
    }
}