open class Person (val age : Int,
                   var gender : String,
                   val weight: Double,
                   val height: Double ){

    open fun IntroduceMyself (){ println("Hey I am ${gender},${age} years old and weighing ${weight} kg")}
}