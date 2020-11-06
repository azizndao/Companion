import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.abdou.companion"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://kotlin.bintray.com/kotlinx/")
}
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.1.0")
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1")
    testImplementation("org.xerial:sqlite-jdbc:3.30.1")
    testImplementation(kotlin("test-junit"))
    testImplementation("mysql:mysql-connector-java:8.0.15")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}