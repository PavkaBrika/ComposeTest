package com.breckneck.composetest

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.breckneck.composetest.ui.theme.ComposeTestTheme
import java.net.InterfaceAddress

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Interface()
                }
            }
        }
    }
}

@Preview
@Composable
fun Interface() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Toolbar()
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CardCompose()
        }
    }
}

@Composable
fun CardCompose() {
    Card() {
        var expanded by remember {
            mutableStateOf(false)
        }
        Column(Modifier.clickable {
            expanded = !expanded
        }) {
            Image(painter = painterResource(id = R.drawable.image), contentDescription = "ds")
            AnimatedVisibility(visible = expanded) {
                Text(
                    text = "Its me",
                    style = MaterialTheme.typography.h2
                )
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
                    .padding(8.dp, 8.dp, 8.dp, 8.dp)
            )
            Text(
                text = "Settings",
                fontSize = 20.sp,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp, 8.dp, 8.dp, 8.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp),
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