package com.jiva.mandi.feature.selling

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

//@Composable
//fun SellingScreen(sellingViewModel: SellingViewModel = hiltViewModel()) {
//
//    val newsResource = sellingViewModel.newsResource.observeAsState()
//    Log.e("value", "inside SellingScreen---------------")
//
//}

@Composable
fun SellingScreen() {

    Log.e("value", "inside SellingScreen---------------")

}

@Composable
@Preview
internal fun SellingButton() {
    Button(onClick = { /*TODO*/
        Log.e("value", "inside SellingScreen button---------------")
    }) {
    }
}