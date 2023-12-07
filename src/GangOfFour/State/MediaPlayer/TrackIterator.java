package GangOfFour.State.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

class TrackIterator {
    private List<String> playlist;
    private int currentTrack;

    public TrackIterator() {
        this.playlist = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        this.currentTrack = 0;
    }

    public String getCurrentTrack() {
        return playlist.get(currentTrack);
    }

    public String getNextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return playlist.get(currentTrack);
    }

    public String getPreviousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return playlist.get(currentTrack);
    }

    public void reset() {
        this.currentTrack = 0;
    }
}
