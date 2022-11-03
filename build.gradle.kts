plugins {
    kotlin("js") version "1.7.20"
}

group = "me.andreaiacono"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
}

kotlin {
    js {
        binaries.executable()
        browser {}
    }
}