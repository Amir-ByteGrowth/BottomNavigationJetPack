package com.example.bottomnavigationjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigationjetpack.bottomnavbars.BottomNavigation
import com.example.bottomnavigationjetpack.bottomnavbars.BottomNavigationGraph

import com.example.bottomnavigationjetpack.ui.theme.BottomNavigationJetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationJetPackTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                Scaffold(bottomBar = { BottomNavigation(navController) }) {
                    BottomNavigationGraph(navController = navController)
                }
            }
        }
    }
}


@Composable
fun MainScreenView(){
   
   
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomNavigationJetPackTheme {
        Greeting("Android")
    }
}