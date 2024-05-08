object Dependency {

    //Libs
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val compat = "androidx.appcompat:appcompat:${Version.compat}"
    const val googleMaterial = "com.google.android.material:material:${Version.googleMaterial}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Version.constraint}"
    const val lifeCycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifeCycle}"
    const val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifeCycle}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
    const val appCompatV7 = "com.android.support:appcompat-v7:${Version.appCompatV7}" //GOOGLE
    const val googlePay = "com.google.android.gms:play-services-wallet:${Version.googlePlay}" //GOOGLE
    const val koinCore = "org.koin:koin-core:${Version.koinVersion}"
    const val koinAndroid = "io.insert-koin:koin-android:${Version.koinVersion}"
    const val koinScope = "org.koin:koin-android-scope:${Version.koinVersion}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Version.koinVersion}"
    const val googleWallet = "com.google.android.gms:play-services-wallet:${Version.googleWallet}"

    //Test Libs
    const val junit = "junit:junit:${Version.junit}"
    const val junitTestExt = "androidx.test.ext:junit:${Version.junitTestExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
}