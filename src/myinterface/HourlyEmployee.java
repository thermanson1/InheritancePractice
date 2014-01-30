

package myinterface;

import java.util.Scanner;

public class HourlyEmployee implements Employee {
    private String firstName;
    private String lastName;
    private String department;
    private double hourlyRate;
    private double totalHours;
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(){
        this.hourlyRate = hourlyRate;
    }
    public double getTotalHours(){
        return totalHours;
    }
    public void setTotalHours(){
        this.totalHours=totalHours;
    }
}
