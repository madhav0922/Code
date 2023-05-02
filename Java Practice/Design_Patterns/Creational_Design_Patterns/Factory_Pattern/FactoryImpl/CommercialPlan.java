package Creational_Design_Patterns.Factory_Pattern.FactoryImpl;

import Creational_Design_Patterns.Factory_Pattern.Factory.Plan;

public class CommercialPlan extends Plan {

    public CommercialPlan() {
        this.planName = "Commercial";
        this.planWattage = 3;
        this.planBasePrice = 100.4f;
    }

}
