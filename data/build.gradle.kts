plugins {
    id(BuildPlugins.Apply.androidLibrary)
    id(BuildPlugins.Apply.kotlinAndroid)
    id(BuildPlugins.Apply.kotlinKapt)
    id(BuildPlugins.Apply.daggerHiltPlugin)
}

android {
    compileSdk = AndroidSdk.compile
    buildToolsVersion = AndroidSdk.buildToolsVersion
    defaultConfig {
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}

dependencies {
    implementation(project(Modules.domain))

    implementation(Libraries.Network.Retrofit.core)
    implementation(Libraries.Network.OkHttp.core)
    implementation(Libraries.Network.OkHttp.logger)

    implementation(Libraries.Hilt.core)
    kapt(Libraries.Hilt.compiler)

    kapt(Libraries.AndroidX.Room.compiler)

    implementation(Libraries.Serializable.kotlinxSerialization)
    implementation(Libraries.AndroidX.ktxCore)
}
