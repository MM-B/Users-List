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
        freeCompilerArgs += "-Xopt-in=kotlinx.serialization.ExperimentalSerializationApi"
        freeCompilerArgs += "-Xopt-in=androidx.compose.material.ExperimentalMaterialApi"
        freeCompilerArgs += "-Xopt-in=androidx.compose.foundation.ExperimentalFoundationApi"
        freeCompilerArgs += "-Xopt-in=com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi"
    }
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Libraries.AndroidX.Compose.version
    }
    packagingOptions {
        resources.excludes.add("META-INF/AL2.0")
        resources.excludes.add("META-INF/LGPL2.1")
    }
}

dependencies {
    api(project(Modules.domain))

    implementation(Libraries.Kotlin.jdk)

    api(Libraries.AndroidX.Navigation.runTime)
    api(Libraries.AndroidX.Navigation.core)

    /* Hilt */
    implementation(Libraries.Hilt.core)
    kapt(Libraries.Hilt.compiler)

    api(Libraries.AndroidX.Compose.compiler)
    api(Libraries.AndroidX.Compose.foundation)
    api(Libraries.AndroidX.Compose.material)
    api(Libraries.AndroidX.Compose.runtime)
    api(Libraries.AndroidX.Compose.runtimeLivedata)
    debugApi(Libraries.AndroidX.Compose.tooling)
    api(Libraries.AndroidX.Compose.ui)
    api(Libraries.AndroidX.Compose.uiUtil)
    api(Libraries.AndroidX.Compose.preview)
    api(Libraries.AndroidX.Compose.animations)
    api(Libraries.AndroidX.Compose.activity)
    api(Libraries.Accompanist.insets)
    api(Libraries.Accompanist.system)
    api(Libraries.AndroidX.Hilt.navigationCompose)

    api(Libraries.ImageUtils.coil)
    api(Libraries.AndroidX.ktxCore)

    api(Libraries.material)
    api(Libraries.AndroidX.appCompat)
}