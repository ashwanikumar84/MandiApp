@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
}

android {
    compileSdk = 33
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.jiva.mandi.core.network"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
//    implementation(project(":core:common"))
//    implementation(project(":core:model"))
//
//    testImplementation(project(":core:testing"))
//
//    implementation(libs.kotlinx.coroutines.android)
//    implementation(libs.kotlinx.serialization.json)
//    implementation(libs.kotlinx.datetime)
//
//    implementation(libs.okhttp.logging)
//    implementation(libs.retrofit.core)
//    implementation(libs.retrofit.kotlin.serialization)
}