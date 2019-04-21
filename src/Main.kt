import kotlin.random.Random

fun main() {

class Generator() {
    fun generateMale() : Person {
        var age : Int = Random.nextInt(18,45)
        var weight : Double = Random.nextDouble(150.0,210.5)
        var height : Double = Random.nextDouble(50.0,150.5)
        var person = Person(age,"Male",weight,height)
        return person
    }
    fun generateFemale() : Person {
        var age : Int = Random.nextInt(18,45)
        var weight : Double = Random.nextDouble(150.0,210.5)
        var height : Double = Random.nextDouble(50.0,150.5)
        var person = Person(age,"Female",weight,height)
        return person
    }

    fun generateMaleBasketballPlayer(): BasketballPlayer {
        var person = generateMale()
        var price: Double = Random.nextDouble(100000.0,2000000.0)
        var chanceToScore: Int = Random.nextInt(10,95)
        return BasketballPlayer(person.age,person.gender,person.weight,person.height,price,chanceToScore)
    }

    fun generateFemaleBasketballPlayer(): BasketballPlayer {
        var person = generateFemale()
        var price: Double = Random.nextDouble(100000.0,2000000.0)
        var chanceToScore: Int = Random.nextInt(10,95)
        return BasketballPlayer(person.age,person.gender,person.weight,person.height,price,chanceToScore)
    }

    fun generateMaleCoach(Name:String,Surname:String) :Coach {
        var person = generateMale()
        return Coach(person.age,person.gender,person.weight,person.height,Name,Surname)
    }

    fun generatefeMaleCoach(Name:String,Surname:String) :Coach {
        var person = generateFemale()
        return Coach(person.age,person.gender,person.weight,person.height,Name,Surname)
    }

    fun generateTeam():MutableList<BasketballPlayer> {
        var Team :  MutableList<BasketballPlayer> = mutableListOf<BasketballPlayer>()
        for ( i in 1..5){
            Team.add(generateMaleBasketballPlayer())
        }
        return Team;
    }

    fun generateBasketballClub (coach :Coach, Name :String, Team:MutableList<BasketballPlayer>): BasketballClub {
        return BasketballClub(Name,coach,Team)
    }

}

    var generator = Generator()

var Coach1 = generator.generateMaleCoach("Ime1","Prezime1")
var Coach2 = generator.generateMaleCoach("Ime2","Prezime2")

var Team1 = generator.generateTeam()
var Team2 = generator.generateTeam()

var basketballClub1 = generator.generateBasketballClub(Coach1,"Cibona",Team1)
var basketballClub2 = generator.generateBasketballClub(Coach2,"Cedevita",Team2)

var FinalGame = Match(basketballClub1,basketballClub2)
    FinalGame.getInfo()
    FinalGame.startTheMatch()
    FinalGame.endTheMatchAndShowResult()
    FinalGame.printWiner()



}
