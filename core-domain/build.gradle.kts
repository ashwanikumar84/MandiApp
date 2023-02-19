@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
}

android {
    compileSdk = 33
    namespace = "com.jiva.mandi.core.domain"
}

dependencies {

    implementation(project(mapOf("path" to ":core-data")))

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}