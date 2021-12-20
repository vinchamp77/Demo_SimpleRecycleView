package com.example.android.recycleviewdemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _items = MutableLiveData<List<ItemData>>()
    val items: LiveData<List<ItemData>>
        get() = _items

    init {
        mockItems()
    }

    private fun mockItems() {
        val itemDataList = mutableListOf<ItemData>()

        var count = 1
        while (count <= 100)
        {

            val data = ItemData(id = count)
            itemDataList.add(data)
            ++count
        }
        _items.postValue(itemDataList)
    }
}