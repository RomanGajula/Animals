package com.example.usingkissdrysolid.animals

class AnimalsDB {

    companion object {
        var listAnimals: MutableList<MutableList<Animal>> = arrayListOf()
    }

    fun addListAnimals(listAnimal: MutableList<Animal>) {
        listAnimals.add(listAnimal)
    }
}