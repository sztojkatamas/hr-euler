plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    id("com.adarshr.test-logger") version "4.0.0"
    id("com.gradleup.shadow") version "9.2.2"
}

tasks.shadowJar {
    archiveVersion = ""
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-context:6.+")
    implementation("io.github.microutils:kotlin-logging-jvm:2.+")
    implementation("ch.qos.logback:logback-classic:1.+")

    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "org.hackerrank.ApplicationKt"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
