package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem007Test : TestBase() {

    @Test
    fun `Nth prime test`() {
        setupInAndOutput("3\n3\n6\n10000\n", "5\n13\n104729")
        Problem007(true).main(arrayOf())
        check()
    }
}