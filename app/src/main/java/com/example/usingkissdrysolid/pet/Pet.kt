package com.example.usingkissdrysolid.pet

import com.example.usingkissdrysolid.animals.Animal

class Pet : IPets {
    lateinit var pet: Animal

    override fun createPets(name: String, type: String) : Animal {
        pet = Animal(name, type)
        savePets()
        return pet
    }

    override fun savePets() {
        PetsDB().addListPets(pet)
    }

}