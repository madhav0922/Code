package Structural_Design_Patterns.Adapter_Pattern.Client;

import Structural_Design_Patterns.Adapter_Pattern.Adapter.SquarePegAdapter;
import Structural_Design_Patterns.Adapter_Pattern.Target.RoundHole;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(3);
        RoundPeg roundPeg = new RoundPeg(3);
        SquarePegAdapter squarePeg = new SquarePegAdapter(new SquarePeg(5));

        System.out.println(roundHole.fits(roundPeg));
        System.out.println(roundHole.fits(squarePeg));
    }
}
