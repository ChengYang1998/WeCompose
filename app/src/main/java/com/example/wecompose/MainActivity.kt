@file:Suppress("SameParameterValue")

package com.example.wecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import com.example.wecompose.ui.theme.WeComposeTheme
import com.rengwuxian.wecompose.ui.ChatPage
import com.rengwuxian.wecompose.ui.Home


class MainActivity : ComponentActivity() {
    private val viewModel: WeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeComposeTheme {
                Box {
                    Home(viewModel)
                    ChatPage()
                }

            }

        }
    }

    override fun onBackPressed() {
        if (!viewModel.endChat()) {
            super.onBackPressed()
        }

    }
}
