package com.example.usingkissdrysolid.wildAnimals

import com.example.usingkissdrysolid.animals.Animal

interface IWildAnimals {
    fun createWildAnimals(name: String, type: String): Animal

    fun savePets()
}