package com.example.prueba2.ui.Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.prueba2.R

@Composable
fun HomeScreens(navController: NavHostController) {
    topbar()

    Column(
        modifier = Modifier
            .padding(top = 60.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Content1()
        Content2()
        Text("Home Screen")

        Button(onClick = { navController.navigate("Main_Menu") }) {
            Text("Return to Main Menu")
        }

        Button(onClick = { navController.navigate("Test_Screen") }) {
            Text("Go to Test Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Content1() {
    Card(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = "This is a title",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                painter = painterResource(R.drawable.bee),
                contentDescription = "Audi TTS",
                contentScale = ContentScale.Crop
            )

            Text(
                text = stringResource(R.string.Texto),
                textAlign = TextAlign.Justify,
                lineHeight = 10.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Content2() {
    Card(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                modifier = Modifier
                    .width(80.dp)
                    .height(100.dp),
                painter = painterResource(R.drawable.bee),
                contentDescription = "Geto",
                contentScale = ContentScale.Inside
            )

            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(
                    text = "This is a title",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = stringResource(R.string.Texto),
                    textAlign = TextAlign.Left,
                    lineHeight = 14.sp,
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun topbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.Black)
            .padding(10.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            Icons.Filled.Menu,
            contentDescription = "Menu Icon",
            tint = Color.Red,
            modifier = Modifier.size(50.dp)
        )

        Text(
            stringResource(R.string.app_name),
            color = Color.White,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}
