@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
//    alias(libs.plugins.android.library)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.jiva.mandi.feature.selling"
//    compileSdk = 33
//
//    defaultConfig {
//        minSdk = 26
//        targetSdk = 33
//
//        testInstrumentationRunner = "android.template.core.testing.HiltTestRunner"
//        consumerProguardFiles("consumer-rules.pro")
//    }
//
//    buildFeatures {
//        compose = true
//        aidl = false
//        buildConfig = false
//        renderScript = false
//        shaders = false
//    }
//
//    composeOptions {
//        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
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
    implementation(project(mapOf("path" to ":core-domain")))
    implementation(project(mapOf("path" to ":core-data")))
//    implementation(project(mapOf("path" to ":core-network")))

//    implementation(project(mapOf("path" to ":core-common")))
//    implementation(project(mapOf("path" to ":core-model")))

//    implementation(libs.androidx.activity.compose)
//    implementation(libs.androidx.lifecycle.livedata.ktx)
//
//    implementation(libs.hilt.android)
//    kapt(libs.hilt.compiler)
//
//
//    implementation(libs.androidx.hilt.navigation.compose)
//
//    implementation(libs.androidx.compose.runtime.livedata)
//    implementation(libs.androidx.compose.ui.tooling.preview)
//    implementation(libs.androidx.compose.material3)
//
//    debugImplementation(libs.androidx.compose.ui.tooling)// required to enable

}