/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Teraesa
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;
    private double annualCommission;

    public double getAnnualCommission() {
        return annualCommission;
    }

    public void setAnnualCommission(double annualCommission) {
        this.annualCommission = annualCommission;
    }
    
    
}
