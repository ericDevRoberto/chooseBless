package com.example.onlinebless.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlinebless.R
import com.example.onlinebless.databinding.FragmentChooseBlessBinding

class ChooseBlessFragment : Fragment() {

    private lateinit var binding: FragmentChooseBlessBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentChooseBlessBinding.inflate(inflater, container, false).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        val items = listOf(
            ListItem("Item 1"),
            ListItem("Item 2"),
            ListItem("Item 3"),
            ListItem("Item 4"),
            ListItem("Item 5")
        )

        val adapter = ListAdapter(items) { item ->
            //Toast.makeText(context, "Clicked: ${item.text}", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.open_choose_bless_to_payment_success)
        }

        binding.recyclerView.adapter = adapter
    }
}