@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")


//    alias(libs.plugins.android.library)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.jiva.mandi.core.data"

}

dependencies {
    implementation(project(mapOf("path" to ":core-network")))
    implementation(project(mapOf("path" to ":core-model")))
    implementation(project(mapOf("path" to ":core-common")))


    implementation(libs.androidx.core.ktx)

//    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
}