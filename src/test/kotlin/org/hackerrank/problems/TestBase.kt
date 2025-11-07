package org.hackerrank.problems

import org.junit.jupiter.api.Assertions
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

open class TestBase {

    var expected = ""
    val outputStream = ByteArrayOutputStream()

    fun setupInAndOutput(input: String, expected: String) {
        val inputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(inputStream)
        System.setOut(PrintStream(outputStream))
        this.expected = expected
    }

    fun check() {
        Assertions.assertEquals(expected.normalizeNewlines(), outputStream.toString().trim().normalizeNewlines())
    }

    fun String.normalizeNewlines(): String = this.replace("\r\n", "\n").replace("\r", "\n")
}
