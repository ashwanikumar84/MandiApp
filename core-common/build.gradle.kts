@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.hilt)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.jiva.mandi.core.common"
//    compileSdk = 33
//
//    defaultConfig {
//        minSdk = 21
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles("consumer-rules.pro")
//    }
//
//    buildFeatures {
//        aidl = false
//        buildConfig = false
//        renderScript = false
//        shaders = false
//    }
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
    implementation(libs.kotlinx.coroutines.android)
//    implementation(libs.hilt.android)
//    kapt(libs.hilt.compiler)
}