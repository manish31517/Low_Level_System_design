package CricBuzz.Team.Player;

import TicTacToe.PlayingPiece;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
    Queue<PlayerDetails>   yetToPlay;
    PlayerDetails striker;
    PlayerDetails nonStriker;


    public PlayerBattingController(Queue<PlayerDetails> yetToPlay) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(yetToPlay);
    }

    public void getNextPlayer() throws Exception{
        if(!yetToPlay.isEmpty()){
            throw new Exception("All out!!");
        }

        if(striker == null){
            striker = yetToPlay.poll();
        }

        if(nonStriker == null){
            striker = yetToPlay.poll();
        }
    }

    public PlayerDetails getStriker() {
        return striker;
    }

    public void setStriker(PlayerDetails striker) {
        this.striker = striker;
    }

    public PlayerDetails getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(PlayerDetails nonStriker) {
        this.nonStriker = nonStriker;
    }
}
