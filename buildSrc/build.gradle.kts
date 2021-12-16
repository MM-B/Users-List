plugins {
    `kotlin-dsl`
}

repositories {
    maven {
        url = uri("https://nexus.partdp.ir/repository/part-android/")
        artifactUrls("https://nexus.partdp.ir/repository/part-android/")
        credentials {
            username = "android-user"
            password = "EL2BB+*wkXEaydY=/2>2Kx-tV4CV-%"
        }
    }
    google()
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}