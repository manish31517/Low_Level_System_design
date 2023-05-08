package CricBuzz.Team.Player;

import java.util.*;

public class PlayerBowlingControll {
     Deque<PlayerDetails > bowlerList;
     Map<PlayerDetails , Integer> bowlerVSOverCount;

     PlayerDetails currentBowler;

     public PlayerBowlingControll(List<PlayerDetails> bowlers){
         setBowlerList(bowlers);
     }

     private void setBowlerList( List<PlayerDetails> bowlerList){
         this.bowlerList = new LinkedList<>();
         bowlerVSOverCount = new HashMap<>();
         for(PlayerDetails player : bowlerList){
             this.bowlerList.addLast(player);
             this.bowlerVSOverCount.put(player,0);
         }
     }

     public  void getNextBowler(int maxOverCountPerBowler){
         PlayerDetails playerDetails = bowlerList.poll();
         if(bowlerVSOverCount.get(playerDetails)+1 == maxOverCountPerBowler){
             currentBowler = playerDetails;
         }
         else{
             currentBowler = playerDetails;
             bowlerList.addLast(playerDetails);
             bowlerVSOverCount.put(playerDetails,bowlerVSOverCount.get(playerDetails)+1);
         }
     }

    public PlayerDetails getCurrentBowler() {
        return currentBowler;
    }
}
