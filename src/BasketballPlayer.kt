import kotlin.random.Random

class BasketballPlayer(
    age:Int,
    gender:String,
    weight:Double,
    height:Double,
    private val price:Double,
    private var chanceToScore : Int
) : Person(age,gender,weight,height), PlayerActivities
{
    private var numOfGoals : Int = 0

    override fun practice(hours: Int) {
        if (hours>=100){
            chanceToScore+=hours/100
        }
    }

    override fun shootOnGoal(): Boolean {
        val shoot: Int = (1..100).random()
        if (shoot<=chanceToScore)
            numOfGoals++
        return shoot<=chanceToScore
    }


    fun sayHey() {println ("Heloo mates im basketball player")}
    fun getNumOfGoals(): Int{ return numOfGoals}
}