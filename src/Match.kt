class Match(
    private val club1 :BasketballClub,
    private val club2 : BasketballClub
): MatchActivities
{
    var Club1Score : Int = 0
    var Club2Score : Int = 0

    override fun startTheMatch() {
        Club1Score = club1.PlayTheGame()
        Club2Score = club2.PlayTheGame()
    }

    override fun endTheMatchAndShowResult() {
        println("Result is  ${Club1Score} : ${Club2Score}")
    }

    override fun printWiner() {
        if (Club1Score==Club2Score) println("draw")
        else if (Club1Score>Club2Score) println("${club1.getTheName()} is winner")
        else println("${club2.getTheName()} is winner")
    }

    fun getInfo(){
      println("This is game between ${club1.getTheName()} and ${club2.getTheName()}")

  }
}