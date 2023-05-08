package CricBuzz.Team;

import CricBuzz.Innings.BallDetails;
import CricBuzz.Innings.OverDetails;
import CricBuzz.Team.Player.PlayerDetails;

public class Wicket {
    public  WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetails;
    public BallDetails ballDetails;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetails, BallDetails ballDetails) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetails = overDetails;
        this.ballDetails = ballDetails;
    }
}
