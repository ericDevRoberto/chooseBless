package com.example.onlinebless.modules

import com.example.onlinebless.futureModule.googleWallet.GooglePayment
import com.example.onlinebless.futureModule.googleWallet.GooglePaymentImpl
import org.koin.dsl.module

val module = module {
    factory<GooglePayment> { GooglePaymentImpl() }
}