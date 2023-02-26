@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.kapt)
}

android {
//    compileSdk = 33
    namespace = "com.jiva.mandi.core.domain"
//
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
}

dependencies {

    implementation(project(mapOf("path" to ":core-data")))
    implementation(project(mapOf("path" to ":core-model")))

    implementation(libs.kotlinx.coroutines.android)
//    implementation(libs.kotlinx.datetime)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
//    implementation(libs.hilt.android)
//    kapt(libs.hilt.compiler)
}