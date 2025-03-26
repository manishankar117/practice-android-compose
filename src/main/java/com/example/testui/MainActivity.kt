package com.example.testui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testui.ui.theme.TestUITheme
import kotlin.collections.EmptyList.size

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier)) {
//    return Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestUITheme {
        Column(
            content = Icon(modifier = Modifier)
        )
    }
}


@Composable
fun Icon(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.size(100.dp), onDraw = {

        val canvasWidth = size.width
        val canvasHeight = size.height

        // we first draw the arc which
        // will be the curve of the logo
        drawArc(
            color = Color.White,
            // arc starts at 0 degree and ends
            startAngle = 0f,
            // set use center to false to draw the
            // arc without centered line
            // Tip: use center to true to draw the arc
            // with centered line and see the difference
            useCenter = false,
            // set the end angle of the arc
            sweepAngle = 300f,
            // set the width of the arc and
            // how the arc cap will be drawn
            // cap = StrokeCap.Round will draw
            // the arc with rounded end
            style = Stroke(width = 40f, cap = StrokeCap.Square)
        )

    })

}
