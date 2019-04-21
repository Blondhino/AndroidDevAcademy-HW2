class Coach (
    age:Int,
    gender:String,
    weight:Double,
    height:Double,
    private val Name: String,
    private val Surname : String
): Person(age,gender,weight,height)
{
    override fun IntroduceMyself (){ println("Hey I am ${Name} ${Surname} and I am coach")}
}