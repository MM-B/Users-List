dependencyResolutionManagement {
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
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "Users List"
include(":app")
