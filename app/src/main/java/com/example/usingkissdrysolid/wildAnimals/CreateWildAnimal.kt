package com.example.usingkissdrysolid.wildAnimals

import com.example.usingkissdrysolid.animals.Animal

class CreateWildAnimal : IWildAnimals {
    lateinit var newWildAnimal: Animal

    override fun createWildAnimals(name: String, type: String): Animal {
        newWildAnimal = Animal(name, type)
        return newWildAnimal
    }

    override fun savePets() {
        WildAnimalsDB().addListPets(newWildAnimal)
    }
}