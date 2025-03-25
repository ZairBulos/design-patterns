package guru.refactoring.adapters;

import guru.refactoring.round.RoundPeg;
import guru.refactoring.square.SquarePeg;

/**
 * Adapter
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
