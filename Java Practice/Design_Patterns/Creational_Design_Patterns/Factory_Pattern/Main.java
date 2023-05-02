package Creational_Design_Patterns.Factory_Pattern;

import Creational_Design_Patterns.Factory_Pattern.Factory.Plan;
import Creational_Design_Patterns.Factory_Pattern.Factory.PlanFactory;

public class Main {
    public static void main(String[] args) {
        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("Personal");

        float bill = plan.getBill();
        String info = plan.getPlanInfo();
        System.out.println(bill);
        System.out.println(info);
    }
}
