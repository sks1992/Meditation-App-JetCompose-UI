package sk.sandeep.meditiationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import sk.sandeep.meditiationapp.ui.HomeScreen
import sk.sandeep.meditiationapp.ui.theme.MeditiationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditiationAppTheme {
                HomeScreen()
            }
        }
    }
}

