package com.example.usingkissdrysolid.wildAnimal

import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.ICreateAnimal

class WildAnimal : ICreateAnimal {
    lateinit var wildAnimal: Animal

    override fun createAnimal(name: String, type: String) {
        wildAnimal = Animal(name, type)
        saveAnimal()
    }

    override fun saveAnimal() {
        WildAnimalsDB().addListPets(wildAnimal)
    }
}