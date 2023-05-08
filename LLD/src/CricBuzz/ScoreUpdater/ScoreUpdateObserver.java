package CricBuzz.ScoreUpdater;

import CricBuzz.Innings.BallDetails;

public interface ScoreUpdateObserver {
    public void update(BallDetails ballDetails);
}
