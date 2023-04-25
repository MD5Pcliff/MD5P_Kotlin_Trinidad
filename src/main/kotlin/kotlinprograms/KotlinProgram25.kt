package kotlinprograms

fun main(){
    var setA = setOf(1, 2 , 3 , 4 , 5)
    var setB = setOf(4 , 5 , 6 , 7 , 8)

    //union
    var unionSet = setA.union(setB)
    println("Union - $unionSet") //removes similar element


    //intersection
    var intersectSet = setA.intersect(setB)
    println("Intersection - $intersectSet") //shows similar element

    //difference
    var diffSet = setA.subtract(setB)
    println("Difference of Set A from Set B - $diffSet") //shows element unique to first set

    var diffSet2 = setB.subtract(setA)
    println("Difference of Set B from Set A - $diffSet2") //shows element unique to second set

    //symmetric difference - its on set A or set B but not in both
    var symmetricSet = diffSet.union(diffSet2)
    println("Symmetric Difference - $symmetricSet")

}