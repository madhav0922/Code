package Creational_Design_Patterns.Factory_Pattern.FactoryImpl;

import Creational_Design_Patterns.Factory_Pattern.Factory.Plan;

public class PersonalPlan extends Plan {

    public PersonalPlan() {
        this.planName = "Personal";
        this.planWattage = 1;
        this.planBasePrice = 50.4f;
    }

}
