package com.example.customnavigationbar.screen.bottomnav

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {




        Text(
            text = "Ridea Ariyanto",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )


        Text(
            text = "rideaAriyanto@gmail.com",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 4.dp)
        )


        Text(
            text = "Universitas kuningan - sistem infomasi",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )


        Text(
            text = "About Me",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed erat felis, fermentum quis sapien vitae, scelerisque feugiat ante. Nam tempus odio ut mauris ultricies, vitae iaculis risus scelerisque. Proin congue.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProfileScreen()
}