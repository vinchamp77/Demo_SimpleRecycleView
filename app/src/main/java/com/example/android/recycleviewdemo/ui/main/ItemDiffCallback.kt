package com.example.android.recycleviewdemo.ui.main

import androidx.recyclerview.widget.DiffUtil

object ItemDiffCallback : DiffUtil.ItemCallback<ItemData>() {
    override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
        return (oldItem == newItem)
    }
}