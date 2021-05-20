package com.example.usingkissdrysolid.wildAnimal

import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.AnimalsDB
import com.example.usingkissdrysolid.animals.IAnimal

class WildAnimalsDB : IAnimal {
    var listWildAnimal: MutableList<Animal> = arrayListOf()

    fun addListPets(animal: Animal) {
        listWildAnimal.add(animal)
        saveAnimal()
    }

    override fun saveAnimal() {
        AnimalsDB().addAnimal(listWildAnimal)
    }
}