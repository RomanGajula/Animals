package com.example.usingkissdrysolid.pet

import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.AnimalsDB
import com.example.usingkissdrysolid.animals.IAnimal

class PetsDB : IAnimal {
    private var listPets: MutableList<Animal> = arrayListOf()

    fun addListPets(animal: Animal) {
        listPets.add(animal)
        saveAnimal()
    }

    override fun saveAnimal() {
        AnimalsDB().addAnimal(listPets)
    }
}