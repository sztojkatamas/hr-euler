package org.hackerrank

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider
import org.springframework.core.type.filter.AnnotationTypeFilter

class Application {

    fun runPuzzles(annotation: Class<out Annotation>) {

        val provider = ClassPathScanningCandidateComponentProvider(false)
        provider.addIncludeFilter(AnnotationTypeFilter(annotation))

        val defs = provider.findCandidateComponents("org.hackerrank").toList()
        defs.forEach {
            (Class.forName(it.beanClassName).getConstructor().newInstance() as BaseChallenge).main(arrayOf())
        }
    }
}

fun main() {
    Application().runPuzzles(EulerChallenge::class.java)
    //Application().runPuzzles(RunOnlyThis::class.java)
}
