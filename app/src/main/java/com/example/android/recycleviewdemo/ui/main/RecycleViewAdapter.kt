package com.example.android.recycleviewdemo.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.android.recycleviewdemo.databinding.ItemBinding

class RecycleViewAdapter()
    : ListAdapter<ItemData, ItemViewHolder> (ItemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val itemBinding = ItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)

        return ItemViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }
}