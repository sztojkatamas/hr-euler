package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem006Test : TestBase() {

    @Test
    fun `Sum square test`() {
        setupInAndOutput("3\n10\n11\n1024\n", "2640\n3850\n275056601600")
        Problem006(true).main(arrayOf())
        check()
    }
}