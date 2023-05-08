package CricBuzz.Team.Player;

import CricBuzz.Team.Player.Score.BattingScoreCard;
import CricBuzz.Team.Player.Score.BowlingScoreCard;

public class PlayerDetails {
    public Person person;
    public PlayerType playerType;
    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;

    public PlayerDetails(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }

    public  void printBattingScoreCard(){
        System.out.println("PlayerName "+ person.name + " -- totalRuns : " + battingScoreCard.totalRuns + " --totalBallsPlayed: "+ battingScoreCard.totalBallsPalyed
        +" --4's: "+ battingScoreCard.totalFours + " -- 6s" + battingScoreCard.totalSix + " outBy : " + ((battingScoreCard.wicketDetails != null) ? battingScoreCard.wicketDetails.takenBy.person.name : "notout") );
    }

    public  void printBowlingScoreCard(){
        System.out.println("PlayerName : " + person.name + " --totalOversThwon " + bowlingScoreCard.totalOversCount
                + " --totalRunsGiven "+ bowlingScoreCard.runsGiven + " --WicketTaken : " + bowlingScoreCard.wicketsTaken);
    }
}

