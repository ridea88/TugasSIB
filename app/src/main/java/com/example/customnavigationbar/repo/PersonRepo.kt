package com.example.customnavigationbar.repo

import com.example.customnavigationbar.model.Person

class PersonRepo {

    fun getAllData():List<Person>{
        return listOf(

            Person(id = 1, Name = "Cut Nyak Dien"),
            Person(id = 2, Name = "Pangeran Diponegoro" ),
            Person(id = 3, Name = "Sultan Hasanuddin" ),
            Person(id = 4, Name = "Jendral Sudirman"),
            Person(id = 5, Name = "Raden Ajeng Kartini" ),
            Person(id = 6, Name = "Bung Tomo"  ),
            Person(id = 7, Name = "I Gusti Ngurah Rai" ),
            Person(id = 8, Name = "Kapiten Pattimura"  ),
            Person(id = 9, Name = "Teuku Umar" ),
            Person(id = 10, Name = "Frans Seda")
        )
    }
}