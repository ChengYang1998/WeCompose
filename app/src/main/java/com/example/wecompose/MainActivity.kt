@file:Suppress("SameParameterValue")

package com.example.wecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wecompose.R.drawable.*
import com.example.wecompose.ui.theme.WeComposeTheme
import com.example.wecompose.ui.theme.black
import com.example.wecompose.ui.theme.green3
import com.example.wecompose.ui.theme.white1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeComposeTheme {
                Column {
                    Row {
                        //            WeBottomBar()
                    }
                }

            }

        }
    }
}

@Composable
private fun WeBottomBar(selected: Int) {

    Row(Modifier.background(white1)) {
        TabItem(
            if (selected == 0) ic_chat_filled else ic_chat_outlined,
            "聊天", if (selected == 0) green3 else black, Modifier.weight(1f)
        )
        TabItem(
            if (selected == 1) ic_contacts_filled else ic_contacts_outlined,
            "通讯录", if (selected == 1) green3 else black, Modifier.weight(1f)
        )
        TabItem(
            if (selected == 2) ic_discovery_filled else ic_discovery_outlined,
            "发现", if (selected == 2) green3 else black, Modifier.weight(1f)
        )
        TabItem(
            if (selected == 3) ic_me_filled else ic_me_outlined,
            "我", if (selected == 3) green3 else black, Modifier.weight(1f)
        )
    }

}


@Composable
private fun TabItem(
    @DrawableRes iconId: Int,
    title: String,
    tint: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier.padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(painterResource(iconId), title, Modifier.size(24.dp), tint = tint)
        Text(title, fontSize = 11.sp)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TabItemPreview() {
//    TabItem(iconId = ic_chat_outlined, title = "聊天", black)
//}

@Preview(showBackground = true)
@Composable
fun WeBottomBarPreview() {
    WeBottomBar(selected = 1)
}


