package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem001Test : TestBase() {

    @Test
    fun `Basic test`() {
        setupInAndOutput("2\n10\n100\n", "23\n2318")
        Problem001().main(arrayOf())
        check()
    }
}