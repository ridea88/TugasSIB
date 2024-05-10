package com.example.customnavigationbar.screen.bottomnav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customnavigationbar.repo.PersonRepo

@Composable
fun ReportScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Lazy Grid", fontSize = 20.sp)
        val personRepository = PersonRepo()
        val getAllData = personRepository.getAllData()
        LazyVerticalGrid(

            columns = GridCells.Fixed(2),
            content = {
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
        )
    }

}