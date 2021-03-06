package com.example.usingkissdrysolid.pet

import com.example.usingkissdrysolid.animals.Animal
import com.example.usingkissdrysolid.animals.ICreateAnimal

class Pet : ICreateAnimal {
    lateinit var pet: Animal

    override fun createAnimal(name: String, type: String) {
        pet = Animal(name, type)
        saveAnimal()
    }

    override fun saveAnimal() {
        PetsDB().addListPets(pet)
    }

}