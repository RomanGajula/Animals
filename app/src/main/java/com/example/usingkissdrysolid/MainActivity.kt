package com.example.usingkissdrysolid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.AnimalsDB
import com.example.usingkissdrysolid.pet.Pet
import com.example.usingkissdrysolid.wildAnimal.CreateWildAnimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                checkAnimalType(Animal("Cat", "Pets"))
                checkAnimalType(Animal("Lion", "Will"))
                checkAnimalType(Animal("Dog", "Pets"))
                checkAnimalType(Animal("Snake", "Will"))
            }

            override fun onFinish() {
                AnimalsDB.animals.forEach {
                    it.forEach {
                        println(it.name)
                        println(it.type)
                    }
                }
            }
        }
        timer.start()

    }

    fun checkAnimalType(animal: Animal) {
        if (animal.type == "Pets") {
            Pet().createPets(animal.name, animal.type)
        } else if (animal.type == "Will") {
            CreateWildAnimal().createWildAnimals(animal.name, animal.type)
        }
    }
}