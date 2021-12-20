package com.example.android.recycleviewdemo.ui.main

import androidx.recyclerview.widget.RecyclerView
import com.example.android.recycleviewdemo.databinding.ItemBinding

class ItemViewHolder(
    private val binding: ItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    private lateinit var _itemData: ItemData

    fun bindData(itemData: ItemData) {
        _itemData = itemData
        binding.itemData = _itemData
        binding.executePendingBindings()
    }
}