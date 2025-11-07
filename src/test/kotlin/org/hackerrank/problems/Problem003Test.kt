package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem003Test : TestBase() {

    @Test
    fun `Largest prime test`() {
        setupInAndOutput("2\n10\n17\n", "5\n17")
        Problem003().main(arrayOf())
        check()
    }
}