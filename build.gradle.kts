group = "cash.andrew"
version = "0.1"

repositories {
    mavenCentral()
}

plugins {
    kotlin("js") version "1.4.31"
    `maven-publish`
}

kotlin {
    js(IR) {
        browser()
    }
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(kotlin.sourceSets["main"].kotlin.srcDirs)
}

publishing {
    publications.invoke {
        register("maven", MavenPublication::class) {
            from(components["kotlin"])
            artifact(sourcesJar.get())
        }
    }
}
