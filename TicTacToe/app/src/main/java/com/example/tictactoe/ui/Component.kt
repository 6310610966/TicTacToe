package com.example.tictactoe.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tictactoe.ui.theme.Aqua
import com.example.tictactoe.ui.theme.DeepPink
import com.example.tictactoe.ui.theme.PurpleA100


@Composable
fun BoardBase() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(10.dp)
    ){
        drawLine(
            color = Color.LightGray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*1/3, y = 0f),
            end = Offset(x = size.width*1/3, y = size.height)
        )
        drawLine(
            color = Color.LightGray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*2/3, y = 0f),
            end = Offset(x = size.width*2/3, y = size.height)
        )
        drawLine(
            color = Color.LightGray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.width*1/3),
            end = Offset(x = size.height, y = size.width*1/3)
        )
        drawLine(
            color = Color.LightGray,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.width*2/3),
            end = Offset(x = size.height, y = size.width*2/3)
        )
    }
}

@Composable
fun Cross() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ){
        drawLine(
            color = Aqua,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.height, y = size.width)
        )
        drawLine(
            color = Aqua,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}

@Composable
fun Circle() {
    Canvas(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp)
    ){
        drawCircle(
            color = PurpleA100,
            style = Stroke(width = 20f)
        )
    }
}

@Composable
fun WinHorizontallLine1() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*1/6),
            end = Offset(x = size.width, y = size.height*1/6)
        )
    }
}

@Composable
fun WinHorizontallLine2() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*3/6),
            end = Offset(x = size.width, y = size.height*3/6)
        )
    }
}

@Composable
fun WinHorizontallLine3() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*5/6),
            end = Offset(x = size.width, y = size.height*5/6)
        )
    }
}

@Composable
fun WinVerticalLine1() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*1/6, y = 0f),
            end = Offset(x = size.width*1/6, y = size.height)
        )
    }
}

@Composable
fun WinVerticalLine2() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*3/6, y = 0f),
            end = Offset(x = size.width*3/6, y = size.height)
        )
    }
}

@Composable
fun WinVerticalLine3() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*5/6, y = 0f),
            end = Offset(x = size.width*5/6, y = size.height)
        )
    }
}

@Composable
fun WinDiagonaLine1() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height)
        )
    }
}

@Composable
fun WinDiagonaLine2() {
    Canvas(modifier = Modifier.size(300.dp)){
        drawLine(
            color = DeepPink,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    WinHorizontallLine1()
    WinHorizontallLine2()
    WinHorizontallLine3()
    WinVerticalLine1()
    WinVerticalLine2()
    WinVerticalLine3()
    WinDiagonaLine1()
    WinDiagonaLine2()
}