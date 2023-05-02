package Structural_Design_Patterns.Proxy_Pattern.Proxy;

import Structural_Design_Patterns.Proxy_Pattern.Interface.OfficeInternetAccess;
import Structural_Design_Patterns.Proxy_Pattern.Real.RealInternetAccess;

/*
 * This is a proxy class for hiding the actual implementation.
 * basically an object representing another object.
 * eg: Security Scenarios, Authentication, Validation
 */
public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeId;

    public ProxyInternetAccess(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void generateInternetAccess() {
        if (checkAuthorization(employeeId) > 8) {
            RealInternetAccess realInternetAccess = new RealInternetAccess(employeeId);
            realInternetAccess.generateInternetAccess();
        } else {
            System.out.println("Internet access not granted for " + employeeId);
        }
    }

    public int checkAuthorization(String employeeId) {
        // actual check from db but using just a condition here
        return 7;
    }

}
