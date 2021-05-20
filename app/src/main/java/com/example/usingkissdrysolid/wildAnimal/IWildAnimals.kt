package com.example.usingkissdrysolid.wildAnimal

import com.example.usingkissdrysolid.animals.Animal

interface IWildAnimals {
    fun createWildAnimals(name: String, type: String): Animal

    fun savePets()
}