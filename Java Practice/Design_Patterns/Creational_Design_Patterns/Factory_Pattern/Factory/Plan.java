package Creational_Design_Patterns.Factory_Pattern.Factory;

public abstract class Plan {
    protected String planName;
    protected int planWattage;
    protected float planBasePrice;

    public float getBill() {
        return (planWattage * planBasePrice);
    }

    public String getPlanInfo() {
        return "Plan Name: " + planName + "\nPlan Wattage: " + planWattage + "\nPlan Base Price: " + planBasePrice;
    }

    public String getPlanName() {
        return planName;
    }

    public int getPlanWattage() {
        return planWattage;
    }

    public float getPlanBasePrice() {
        return planBasePrice;
    }

}
