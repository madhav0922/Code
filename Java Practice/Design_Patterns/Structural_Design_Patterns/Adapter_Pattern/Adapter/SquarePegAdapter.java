package Structural_Design_Patterns.Adapter_Pattern.Adapter;

import Structural_Design_Patterns.Adapter_Pattern.Client.RoundPeg;
import Structural_Design_Patterns.Adapter_Pattern.Client.SquarePeg;

/*
 * Adapter pattern acts as an adapter to fit something into from another
 * eg: XML to JSON convertor or vice versa
 */
// Since its an adapter for SquarePeg to fit RoundPeg it would extend RoundPeg
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter() {
    }

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public double getRadius() {
        return squarePeg.getSide() * Math.sqrt(2) / 2;
    }

}
