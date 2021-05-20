package com.example.usingkissdrysolid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.AnimalsDB
import com.example.usingkissdrysolid.pet.Pet
import com.example.usingkissdrysolid.wildAnimal.WildAnimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkAnimalType(Animal("Cat", "Pets"))
        checkAnimalType(Animal("Lion", "Will"))
        checkAnimalType(Animal("Dog", "Pets"))
        checkAnimalType(Animal("Snake", "Will"))
        AnimalsDB.animals.forEach {
            it.forEach {
                println("----->" + it.name)
                println("->>>>>>>>>" + it.type)
            }
        }

    }

    fun checkAnimalType(animal: Animal) {
        if (animal.type == "Pets") {
            Pet().createAnimal(animal.name, animal.type)
        } else if (animal.type == "Will") {
            WildAnimal().createAnimal(animal.name, animal.type)
        }
    }
}