package Structural_Design_Patterns.Proxy_Pattern.Real;

import Structural_Design_Patterns.Proxy_Pattern.Interface.OfficeInternetAccess;

public class RealInternetAccess implements OfficeInternetAccess {
    private String employeeId;

    public RealInternetAccess(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void generateInternetAccess() {
        System.out.println("Internet granted for " + employeeId);
    }

}
