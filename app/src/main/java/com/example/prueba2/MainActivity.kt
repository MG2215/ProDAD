package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prueba2.ui.theme.Prueba2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba2Theme {
                Column() {
                    Column() {
                        TextComposable()
                        TextComposable()
                        TextComposable()
                    }
                    Row() {
                        TextComposable()
                        TextComposable()
                        TextComposable()
                    }
                    Column {
                        ModifierExample2()
                        CustomText()
                    }
                }
                Column {
                    ModifierExample4()
                }
            }
        }
    }
}
@Preview(showBackground = true)

@Composable
fun TextComposable (name: String = "Empty") {
    Text("Hello World")
    Text(name)
}
@Preview(showBackground = true)
@Composable
fun ModifierExample1() {
    Column(
        modifier = Modifier
            .padding(50.dp,30.dp, 20.dp, 10.dp)
    ) {

        Text("Hello World")
    }
}

@Preview(showBackground = true)
@Composable
fun ModifierExample2() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .clickable(onClick = { clickAction() })
    ) {

        Text("Hello World")
    }
}
fun clickAction(){
    println("Column Clicked")
}
@Preview(showBackground = true)
@Composable
fun ModifierExample3() {

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .background(Color.Yellow)
            .border(width = 2.dp, color = Color.Green)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally ,
        verticalArrangement = Arrangement.SpaceEvenly

    ) {
        TextComposable("1")
        TextComposable("2")
        TextComposable("3")
        TextComposable("4")
        TextComposable("5")
        TextComposable("6")
    }
}
@Preview(showBackground = true)
@Composable
fun ModifierExample4() {
    Box(
        modifier = Modifier
            .background(Color.Cyan)
            .padding (10.dp)
            .height(300.dp)
            .width(300.dp)

    ){
        Text("1", Modifier.align(Alignment.TopStart))
        Text("2", Modifier.align(Alignment.TopCenter))
        Text("3", Modifier.align(Alignment.TopEnd))
        Text("4", Modifier.align(Alignment.CenterStart))
        Text("5", Modifier.align(Alignment.Center))
        Text("6", Modifier.align(Alignment.CenterEnd))
        Text("7", Modifier.align(Alignment.BottomStart))
        Text("8", Modifier.align(Alignment.BottomCenter))
        Text("9", Modifier.align(Alignment.BottomEnd))
    }
}
@Preview(showBackground = true)
@Composable
fun CustomText (){
    Column {
        Text(
            stringResource(R.string.example_text),
            color = colorResource(R.color.purple_500),
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight =  FontWeight.ExtraBold
        )
        val gradienColor =listOf(Color.Cyan, Color.Red, colorResource(R.color.teal_200))
        Text(
            stringResource(R.string.example_text),
            style = TextStyle(brush = Brush.linearGradient(colors = gradienColor))
        )
    }
}