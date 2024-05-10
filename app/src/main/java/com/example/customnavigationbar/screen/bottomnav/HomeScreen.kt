package com.example.customnavigationbar.screen.bottomnav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customnavigationbar.repo.PersonRepo

@Composable
fun HomeScreen() {
    val personRepository = PersonRepo()
    val getAllData = personRepository.getAllData()
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Lazy Row dan Colum", fontSize = 20.sp)


        LazyRow {
            items(items = getAllData) { person ->
                Card(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .width(150.dp), // Set a fixed width for each card
                    backgroundColor = Color.Magenta,
                    elevation = 4.dp // Optional for depth
                ) {
                    Text(
                        text = person.Name,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(16.dp) // Add padding for content
                    )
                }
            }
        }
        Spacer(modifier = Modifier.size(20.dp))

        LazyColumn {
            items(items = getAllData) { person ->
                Card(
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                        .fillMaxWidth(),
                    backgroundColor = Color.Magenta,
                    elevation = 4.dp
                ) {
                    Text(
                        text = person.Name,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }






}





}