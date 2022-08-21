plugins {
    BuildPlugin
    com.android.library
    `kotlin-android`
    `kotlin-kapt`
}

dependencies {
    // expose Glide as api since we may need to use transformers etc
    api("com.github.bumptech.glide:glide:4.13.2")
    kapt("com.github.bumptech.glide:compiler:4.13.2")

    kapt(Dependencies.AndroidXAnnotations)

    implementation(Dependencies.AndroidXAppCompat)
    implementation(Dependencies.KotlinStdLib)
}
android {
    buildTypes {
        create("preview") {
            matchingFallbacks += listOf("debug")
        }
    }
}
