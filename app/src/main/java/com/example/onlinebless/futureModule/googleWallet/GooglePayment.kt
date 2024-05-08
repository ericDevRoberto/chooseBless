package com.example.onlinebless.futureModule.googleWallet

import android.app.Activity
import com.google.android.gms.wallet.PaymentsClient
import com.google.android.gms.wallet.Wallet
import com.google.android.gms.wallet.WalletConstants

class GooglePaymentImpl: GooglePayment {
    override fun createPaymentsClient(activity: Activity): PaymentsClient {
        val walletOptions = Wallet.WalletOptions.Builder()
            .setEnvironment(WalletConstants.ENVIRONMENT_TEST).build()
        return Wallet.getPaymentsClient(activity, walletOptions)
    }
}

interface GooglePayment {
    fun createPaymentsClient(activity: Activity): PaymentsClient
}