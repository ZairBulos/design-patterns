package guru.refactoring.states;

import guru.refactoring.ui.Player;

/**
 * State
 */
public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
