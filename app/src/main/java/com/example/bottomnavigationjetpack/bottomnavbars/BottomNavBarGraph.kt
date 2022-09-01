package com.example.bottomnavigationjetpack.bottomnavbars

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationjetpack.screens.*

@Composable
fun BottomNavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItems.Home.screen_route) {
        composable(BottomNavItems.Home.screen_route) {
            CreateHomeScreen()
        }
        composable(BottomNavItems.MyNetwork.screen_route) {
            CreateNetworkScreen()
        }
        composable(BottomNavItems.AddPost.screen_route) {
            CreateAddPostScreen()
        }
        composable(BottomNavItems.Notification.screen_route) {
            CreateNotificationScreen()
        }
        composable(BottomNavItems.Jobs.screen_route) {
            CreateJobScreen()
        }
    }
}

