package GangOfFour.State.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

class Player {
    private State state;
    private boolean playing = false;
    private TrackIterator trackIterator;
    private long startTime;

    public Player() {
        this.state = new ReadyState(this);
        this.trackIterator = new TrackIterator();
        setPlaying(true);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        startTime = System.currentTimeMillis();
        return "Playing " + trackIterator.getCurrentTrack();
    }

    public String nextTrack() {
        String nextTrack = trackIterator.getNextTrack();
        startTime = System.currentTimeMillis(); // Reset the timer for the new track
        return "Playing " + nextTrack;
    }

    public String previousTrack() {
        String previousTrack = trackIterator.getPreviousTrack();
        startTime = System.currentTimeMillis(); // Reset the timer for the new track
        return "Playing " + previousTrack;
    }

    public void setCurrentTrackAfterStop() {
        trackIterator.reset();
    }

    public boolean isTrackDamaged() {
        // Check if the current track has been playing for more than 3 seconds
        long elapsedTime = System.currentTimeMillis() - startTime;
        return elapsedTime > 3000;
    }
}
