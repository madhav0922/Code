package Structural_Design_Patterns.Adapter_Pattern.Target;

import Structural_Design_Patterns.Adapter_Pattern.Client.RoundPeg;

public class RoundHole {
    public double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.getRadius() >= roundPeg.getRadius();
    }
}
