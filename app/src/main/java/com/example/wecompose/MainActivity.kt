@file:Suppress("SameParameterValue")

package com.example.wecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.wecompose.ui.ChatList
import com.example.wecompose.ui.WeBottomBar
import com.example.wecompose.ui.theme.WeComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeComposeTheme {
                Column {

                    val viewModel: WeViewModel = viewModel()

                    HorizontalPager(count = 4) { page ->
                        when (page) {
                            0 -> ChatList(viewModel.chats)
                            1 -> Box(Modifier.fillMaxSize())
                            2 -> Box(Modifier.fillMaxSize())
                            3 -> Box(Modifier.fillMaxSize())


                        }
                    }


                    WeBottomBar(viewModel.selectedTab) {
                        viewModel.selectedTab = it
                    }


                }

            }

        }
    }


}
