package Structural_Design_Patterns.Proxy_Pattern.Client;

import Structural_Design_Patterns.Proxy_Pattern.Interface.OfficeInternetAccess;
import Structural_Design_Patterns.Proxy_Pattern.Proxy.ProxyInternetAccess;

public class Employee {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("MADHAV SHARMA");
        officeInternetAccess.generateInternetAccess();
    }
}
