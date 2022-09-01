package com.example.bottomnavigationjetpack.bottomnavbars

import com.example.bottomnavigationjetpack.R

sealed class BottomNavItems (var title:String,var icon:Int,var screen_route:String){
    object Home : BottomNavItems("Home", R.drawable.home,"home")
    object MyNetwork: BottomNavItems("My Network",R.drawable.network,"my_network")
    object AddPost: BottomNavItems("Post",R.drawable.post_job,"add_post")
    object Notification: BottomNavItems("Notification",R.drawable.notification,"notification")
    object Jobs: BottomNavItems("Jobs", R.drawable.job,"jobs")
}