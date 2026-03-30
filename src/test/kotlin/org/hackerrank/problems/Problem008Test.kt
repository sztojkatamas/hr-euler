package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem008Test : TestBase() {

        @Test
        fun `Largest product test`() {
            setupInAndOutput("2\n10 5\n3675356291\n10 5\n2709360626\n", "3150\n0")
            Problem008(true).main(arrayOf())
            check()
        }
    }