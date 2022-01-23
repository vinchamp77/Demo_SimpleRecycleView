package com.example.android.recycleviewdemo.ui.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.android.recycleviewdemo.R
import com.example.android.recycleviewdemo.ui.theme.RecycleViewDemoTheme

@Composable
fun MainScreen(viewModel: MainViewModel) {
    RecycleViewDemoTheme {
        Scaffold(
            topBar = { TopAppBar (title = { Text(stringResource(R.string.app_name)) })
            }
        ) {
            MainContent(viewModel)
        }
    }
}

@Composable
fun MainContent(viewModel: MainViewModel) {
    val itemsState = viewModel.items.observeAsState()

    itemsState.value?.let { items ->
        ListContent(items)
    }
}

@Composable
fun ListContent(items: List<ItemData>) {
    LazyColumn (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(items = items) { item ->
            ShowItem(item)
        }
    }
}

@Composable
fun ShowItem(item: ItemData) {
    Text(
        text = item.id.toString(),
        fontSize = 34.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val viewModel = MainViewModel()
    MainScreen(viewModel)
}