package com.example.usingkissdrysolid.pet

import com.example.usingkissdrysolid.animals.Animal

interface IPets {
    fun createPets(name: String, type: String): Animal

    fun savePets()
}