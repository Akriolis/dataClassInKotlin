// Every class is subclass of Any
// By default, equals function returns true if variables point to the same object
// A data class lets you create a data objects

data class testRecipe (val title: String, val isVegeterian: Boolean){

}

class testRecipe2 (val title: String, val isVegeterian: Boolean){

}

fun main(){
    val r1 = testRecipe ("Pepperoni pizza", false)
    val r2 = testRecipe ("Pepperoni pizza", false)
    if (r1 == r2) println("Equals") else println ("Not equals")


    val r3 = testRecipe2 ("Pepperoni pizza", false)
    val r4 = testRecipe2 ("Pepperoni pizza", false)
    if (r3 == r4) println("Equals") else println ("Not equals")

    println(r1.toString())
    println(r3.toString())

    val r5 = r1.copy() // create a new copy of the object and leaves the original object intact.
    val r6 = r1.copy(isVegeterian = true)
    val testTitle = r1.component1()
    val testTitle2 = r1.title
    println(testTitle)
    println(testTitle2)

    // Destruction a data object splits it onto its component parts
    val (x, y) = r1
    println(x)
    println(y)
    // this code is similar to code
    // val x = r1.component1() or r.title
    // val y = r.component2() or r.isVegeterian

    if (r1 === r2) println("Equals for sure") else println ("Not equals for sure")
    // === operator lets you check whether two variables refer to the same underlying object
    // in data class, == checks for equivalence and === checks for object identity




}