package com.jmts.firebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jmts.firebase.ui.TareasScreen
import com.jmts.firebase.ui.theme.FireBaseTheme
import com.jmts.firebase.viewmodel.TareasViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FireBaseTheme() {
                val viewModel: TareasViewModel = viewModel()
                TareasScreen(viewModel = viewModel)
            }
        }
    }
}