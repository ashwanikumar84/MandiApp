@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

//    alias(libs.plugins.android.library)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.jiva.mandi.core.network"

//    compileSdk = 33
    buildFeatures {
        buildConfig = true
    }

//    testOptions {
//        unitTests {
//            isIncludeAndroidResources = true
//        }
//    }
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//
//    kotlinOptions {
//        jvmTarget = "11"
//    }
}

dependencies {
    implementation(project(mapOf("path" to ":core-common")))
    implementation(project(mapOf("path" to ":core-model")))


    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.datetime)

    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)

//    // Arch Components
//    implementation(libs.hilt.android)
//    kapt(libs.hilt.compiler)
//
//
//    implementation(libs.okhttp.logging)
//    implementation(libs.retrofit.core)
//    implementation(libs.retrofit.kotlin.serialization)
//    implementation(libs.kotlinx.serialization.json)


}