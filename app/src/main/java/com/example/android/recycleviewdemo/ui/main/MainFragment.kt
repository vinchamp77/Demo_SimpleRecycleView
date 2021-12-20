package com.example.android.recycleviewdemo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.android.recycleviewdemo.R
import com.example.android.recycleviewdemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = MainFragmentBinding.inflate(inflater)

        val adapter = RecycleViewAdapter()
        binding.recyclerView.adapter = adapter

        viewModel.items.observe(viewLifecycleOwner, { items ->
            adapter.submitList(items)
        })

        return binding.root
    }
}