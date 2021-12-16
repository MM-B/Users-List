// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
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
    dependencies {
        classpath(BuildPlugins.GradleClassPath.androidGradlePlugin)
        classpath(BuildPlugins.GradleClassPath.kotlinGradlePlugin)
        classpath(BuildPlugins.GradleClassPath.hiltGradlePlugin)
        classpath(BuildPlugins.GradleClassPath.kotlinSerialization)
    }
}

allprojects {
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
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}