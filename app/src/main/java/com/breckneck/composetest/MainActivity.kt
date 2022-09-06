package com.breckneck.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.breckneck.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Toolbar()
                }
            }
        }
    }
}
@Preview
@Composable
fun Toolbar() {
    Column(
        verticalArrangement = Arrangement.spacedBy(1.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Back!",
                fontSize = 20.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp, 16.dp, 16.dp, 1.dp)
            )
            Text(
                text = "Settings",
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp, 16.dp, 16.dp, 1.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().height(1.dp),
        ) {
            Text(
                text = "",
                fontSize = 20.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)

            )
        }
    }


}