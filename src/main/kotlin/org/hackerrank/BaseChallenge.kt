package org.hackerrank

import java.io.ByteArrayInputStream

abstract class BaseChallenge(private val problemId: String? = null, private val testOverride: Boolean = false) {

    abstract fun main(args: Array<String>)

    init {
        if (!testOverride) {
        problemId?.let { id ->
            val resourceName = "/$id.txt"
            val resource = this::class.java.getResourceAsStream(resourceName)
            if (resource != null) {
                System.setIn(ByteArrayInputStream(resource.readBytes()))
            } else {
                println("[BaseChallenge] No resource found for $resourceName, using console input.")
            }
        }
        }
    }

}