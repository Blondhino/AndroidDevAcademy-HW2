class BasketballClub (private var Name: String,
                      private var Coach : Coach ,
                      private var Team :List <BasketballPlayer>) : ClubActivities
{
    override fun PlayTheGame(): Int {
        var score:Int = 0
        for (x in 1..5){
        for(i in 0..Players.size-1) {
            if(Players[i].shootOnGoal())
                score++
        } }
        return score
    }
    fun getTheName(): String{return Name}
    private var NumOfWins =0
    private var NumOfLoses =0
    fun weAreWin(){NumOfWins++}
    fun weAreLose(){NumOfLoses++}
    fun getNumOfMatchesPlayed() : Int {return  NumOfLoses+NumOfWins}
    val Players : List<BasketballPlayer> = Team

}