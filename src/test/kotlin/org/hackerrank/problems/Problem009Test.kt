package org.hackerrank.problems

import org.junit.jupiter.api.Test

class Problem009Test : TestBase() {

        @Test
        fun `Special Pythagorean triplet test`() {
            setupInAndOutput("2\n12\n4\n", "60\n-1")
            Problem009(true).main(arrayOf())
            check()
        }
    }