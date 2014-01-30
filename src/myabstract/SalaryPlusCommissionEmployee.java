/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Teraesa
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    private double annualCommission;
    private double annualPay;

    public double getAnnualCommission() {
        return annualCommission;
    }

    public void setAnnualCommission(double annualCommission) {
        this.annualCommission = annualCommission;
    }
    
    public double getAnnualPay(double annualSalary, double annualCommission){
        annualPay = annualSalary + annualCommission;
        return annualPay;
    }
    
}
