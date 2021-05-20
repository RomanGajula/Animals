package com.example.usingkissdrysolid.wildAnimals

import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.AnimalsDB
import com.example.usingkissdrysolid.animals.IAnimal

class WildAnimalsDB : IAnimal {
    lateinit var listWildAnimal: MutableList<Animal>

    fun addListPets(animal: Animal) {
        listWildAnimal.add(animal)
    }

    override fun saveAnimal() {
        AnimalsDB().addListAnimals(listWildAnimal)
    }
}