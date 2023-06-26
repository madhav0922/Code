package Creational_Design_Patterns.Factory_Pattern.Factory;

import Creational_Design_Patterns.Factory_Pattern.FactoryImpl.CommercialPlan;
import Creational_Design_Patterns.Factory_Pattern.FactoryImpl.PersonalPlan;

/*
 * Factory method states that define an interface and let the sub-classes decide which object to create
 * Product ki concrete class ko Creater ki concrete class create karegi
 * 
 * When to use -> Jab bhi object creation business logic par dependent ho
 * eg: Fruit Ninja
 */
public class PlanFactory {
    public Plan getPlan(String planName) {
        if (planName == new CommercialPlan().getPlanName()) {
            return new CommercialPlan();
        } else { // dont use else, otherwise for all other plans this plan would become default.
                 // Ofcourse if default requires we could call this way.
            return new PersonalPlan();
        }
    }
}
