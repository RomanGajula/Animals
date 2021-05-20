package com.example.usingkissdrysolid.pets

import com.example.usingkissdrysolid.animals.Animal

class CreatePets : IPets {
    lateinit var newPets: Animal

    override fun createPets(name: String, type: String) : Animal {
        newPets = Animal(name, type)
        savePets()
        return newPets
    }

    override fun savePets() {
        PetsDB().addListPets(newPets)
    }

}