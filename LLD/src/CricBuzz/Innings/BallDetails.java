package CricBuzz.Innings;

import CricBuzz.ScoreUpdater.BattingScoreUpdater;
import CricBuzz.ScoreUpdater.BowlingScoreUpdater;
import CricBuzz.ScoreUpdater.ScoreUpdateObserver;
import CricBuzz.Team.Player.PlayerDetails;
import CricBuzz.Team.Team;
import CricBuzz.Team.Wicket;
import CricBuzz.Team.WicketType;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {
  public int ballNumber;
  public BAllType bAllType;
  public  RunType runType;
  public PlayerDetails playedBy;
  public PlayerDetails bowledBy;
  public Wicket wicket;
  List<ScoreUpdateObserver> scoreUpdateObserverList = new ArrayList<>();

  public BallDetails(int ballNumber) {
    this.ballNumber = ballNumber;
    scoreUpdateObserverList.add(new BowlingScoreUpdater());
    scoreUpdateObserverList.add(new BattingScoreUpdater());
  }

  public void startBallDelivery(Team battingTeam , Team bowlingTeam, OverDetails over){
     playedBy = battingTeam.getStriker();
     this.bowledBy = over.bowledBy;

     bAllType = BAllType.NORMAL;

     if(isWicketTaken()){
        runType = RunType.ZERO;

        wicket = new Wicket(WicketType.BOLD, bowlingTeam.getCurrentBowler(), over, this);
        battingTeam.setStriker(null);
     }else{
       runType = getRunType();

       if(runType == RunType.ONE || runType == RunType.THREE){
         PlayerDetails temp = battingTeam.getStriker();
         battingTeam.setStriker(battingTeam.getNonStriker());
         battingTeam.setNonStriker(temp);
       }

       notifyUpdaters(this);
     }
  }

  private   void notifyUpdaters(BallDetails ballDetails){
     for(ScoreUpdateObserver scoreUpdateObserver : scoreUpdateObserverList){
       scoreUpdateObserver.update(ballDetails);
     }
  }

  private  RunType getRunType(){
       double val = Math.random();
       if(val <= 0.2){
         return RunType.ONE;
       }else if(val >= 0.3 && val <= 0.5){
           return RunType.TWO;
        }else if(val >= 0.6 && val <= 0.8){
         return RunType.FOUR;
       }
       return RunType.ZERO;
  }

  private  boolean isWicketTaken(){
    if(Math.random() < 0.2){
      return true;
    }
    return false;
  }

  

}
