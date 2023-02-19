@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
}


android {
    namespace = "com.jiva.mandi.core.data"
    compileSdk = 33

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        aidl = false
        buildConfig = false
        renderScript = false
        shaders = false
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
//    implementation(project(mapOf("path" to ":core-model")))
    implementation(project(mapOf("path" to ":core-network")))

    // Arch Components
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.androidx.core.ktx)

    // Local tests: jUnit, coroutines, Android runner
    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
//    implementation(libs.kotlinx.serialization.json)
}