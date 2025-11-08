package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem005Test : TestBase() {

    @Test
    fun `Smallest multiple test`() {
        setupInAndOutput("2\n3\n10\n", "6\n2520")
        Problem005(true).main(arrayOf())
        check()
    }
}