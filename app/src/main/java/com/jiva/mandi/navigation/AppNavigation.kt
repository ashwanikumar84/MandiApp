package com.jiva.mandi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jiva.mandi.common.AppNavConstants
import com.jiva.mandi.screens.OrderConfirmationScreen
import com.jiva.mandi.screens.order.PrepareOrderScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = AppNavConstants.HOME_SCREEN
    ) {
        composable(AppNavConstants.HOME_SCREEN) {
            PrepareOrderScreen(navController = navController)
        }
        // Confirmation Screen
        composable(AppNavConstants.CONFIRMATION_SCREEN) {
            OrderConfirmationScreen(navController = navController)
        }

    }
}

