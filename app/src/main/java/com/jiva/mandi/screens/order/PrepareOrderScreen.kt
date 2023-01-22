package com.jiva.mandi.screens.order

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.jiva.mandi.R
import com.jiva.mandi.common.AppNavConstants

@Composable
fun PrepareOrderScreen(navController: NavHostController) {
    SetupOrderScreen(navController)
}

@Composable
fun SetupOrderScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
                .weight(1f)
        ) {
            Text(
                text = stringResource(id = R.string.title_mandi),
                color = colorResource(id = R.color.black),
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Button(modifier = Modifier
            .padding(all = 20.dp)
            .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.green),
                contentColor = colorResource(id = R.color.white)
            ),
            onClick = { navController.navigate(AppNavConstants.CONFIRMATION_SCREEN) }) {
            Text(
                text = stringResource(R.string.sell_my_produce),
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
        }
    }
}