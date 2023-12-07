package GangOfFour.State.MediaPlayer;

public class DamagedState extends State {

    DamagedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        return "Player is damaged. Please reset.";
    }

    @Override
    public String onPlay() {
        return "Player is damaged. Please reset.";
    }

    @Override
    public String onNext() {
        return "Player is damaged. Please reset.";
    }

    @Override
    public String onPrevious() {
        return "Player is damaged. Please reset.";
    }
}