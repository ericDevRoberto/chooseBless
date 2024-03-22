plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.onlinebless"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.onlinebless"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependency.core)
    implementation(Dependency.compat)
    implementation(Dependency.googleMaterial)
    implementation(Dependency.constraint)
    implementation(Dependency.lifeCycleLiveData)
    implementation(Dependency.lifeCycleViewModel)
    implementation(Dependency.navigationFragment)
    implementation(Dependency.navigationUi)
    testImplementation(Dependency.junit)
    androidTestImplementation(Dependency.junitTestExt)
    androidTestImplementation(Dependency.espresso)
}