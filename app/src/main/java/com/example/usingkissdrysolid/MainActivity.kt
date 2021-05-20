package com.example.usingkissdrysolid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.AnimalsDB
import com.example.usingkissdrysolid.pets.CreatePets
import com.example.usingkissdrysolid.wildAnimals.CreateWildAnimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                checkAnimals(Animal("Cat", "Pets"))
                checkAnimals(Animal("Lion", "Will"))
                checkAnimals(Animal("Dog", "Pets"))
                checkAnimals(Animal("Snake", "Will"))
            }

            override fun onFinish() {
                AnimalsDB.listAnimals.forEach {
                    it.forEach {
                        println(it.name)
                        println(it.type)
                    }
                }
            }
        }
        timer.start()

    }

    fun checkAnimals(animal: Animal) {
        if (animal.type == "Pets") {
            CreatePets().createPets(animal.name, animal.type)
        }

        if (animal.type == "Will") {
            CreateWildAnimal().createWildAnimals(animal.name, animal.type)
        }
    }
}