/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
/**
 *
 * @author Admin
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount user = system.getUserAccountDirectory().createUserAccount("sysadmin","sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
}
