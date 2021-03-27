group = "cash.andrew"
version = "0.1"

repositories {
    mavenCentral()
}

plugins {
    kotlin("js") version "1.4.31"
}

kotlin {
    js(IR) {
        browser()
    }
}

