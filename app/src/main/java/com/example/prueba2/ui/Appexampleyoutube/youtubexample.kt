package com.example.prueba2.ui.Appexampleyoutube

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalContext
import android.widget.Toast
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.draw.clip
import com.example.prueba2.R

@Preview(showBackground = true)
@Composable
fun PreviewYouTubeUI() {
    Column(modifier = Modifier.fillMaxSize()) {
        topbar()
        BottomCategories()
        SponsoredCard()
        BottomNavigationBar()
    }
}

@Composable
fun topbar() {
    val density = LocalDensity.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Black)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.logoyoutube),
            contentDescription = "YouTube Logo",
            modifier = Modifier.size(with(density) { 100.dp.toPx().dp })
        )

        Spacer(modifier = Modifier.weight(1f))

        Row {
            val context = LocalContext.current
            IconButton(onClick = { Toast.makeText(context, "Notificaciones presionado", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "Notificaciones",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(onClick = { Toast.makeText(context, "Buscar presionado", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Buscar",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
        }
    }
}

@Composable
fun BottomCategories() {
    val categories = listOf(
        "Todos", "Música", "Películas", "En Vivo", "Videojuegos", "Noticias", "Podcast", "Deportes"
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(vertical = 10.dp),
        contentPadding = PaddingValues(horizontal = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(categories) { category ->
            CategoryChip(category)
        }
    }
}

@Composable
fun CategoryChip(category: String) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .background(Color.DarkGray, RoundedCornerShape(20.dp))
            .padding(horizontal = 20.dp, vertical = 8.dp)
            .clickable { Toast.makeText(context, "Categoría: $category presionada", Toast.LENGTH_SHORT).show() }
    ) {
        Text(text = category, color = Color.White, fontSize = 14.sp)
    }
}

@Composable
fun SponsoredCard() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.Black, RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.image_placeholder),
            contentDescription = "Elemento patrocinado",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Hervimos de la emoción 🔥",
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = "El fuego y el agua no se mezclaban... hasta ahora.",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { Toast.makeText(context, "Mirar presionado", Toast.LENGTH_SHORT).show() }) {
                Text(text = "Mirar")
            }
            Button(onClick = { Toast.makeText(context, "Ver más presionado", Toast.LENGTH_SHORT).show() }) {
                Text(text = "Ver más")
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector = Icons.Filled.Home, contentDescription = "Principal", tint = Color.White)
            Text(text = "Principal", color = Color.White, fontSize = 12.sp)
        }
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Más", tint = Color.White, modifier = Modifier.clickable {
            Toast.makeText(context, "Más presionado", Toast.LENGTH_SHORT).show()
        })
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector = Icons.Filled.List, contentDescription = "Suscripciones", tint = Color.White)
            Text(text = "Suscripciones", color = Color.White, fontSize = 12.sp)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Cuenta", tint = Color.White)
            Text(text = "Cuenta", color = Color.White, fontSize = 12.sp)
        }
    }
}
