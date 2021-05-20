package com.example.usingkissdrysolid.animals

class AnimalsDB {

    companion object {
        var animals: MutableList<MutableList<Animal>> = arrayListOf()
    }

    fun addAnimal(listAnimal: MutableList<Animal>) {
        animals.add(listAnimal)
    }
}