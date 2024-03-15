package com.example.onlinebless.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.onlinebless.databinding.FragmentPaymentSuccessBinding

class PaymentSuccessFragment : Fragment() {

    private lateinit var binding: FragmentPaymentSuccessBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentPaymentSuccessBinding.inflate(inflater, container, false).apply {
        binding = this

    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textSubTitle.setOnClickListener {
            activity?.finish()
        }
    }
}