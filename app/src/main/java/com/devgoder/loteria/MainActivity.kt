package com.devgoder.loteria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devgoder.loteria.ui.theme.LoteriaTheme
import com.devgoder.loteria.viewModels.ContadorViewModel
import com.devgoder.loteria.viewModels.LoteriaViewModel
import com.devgoder.loteria.views.Contador
import com.devgoder.loteria.views.LoteriaView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val viewModel : ContadorViewModel by viewModels()
        val viewModel : LoteriaViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            LoteriaTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   //Contador(viewModel = viewModel)
                    LoteriaView(viewModel = viewModel)
                }
            }
        }
    }
}
