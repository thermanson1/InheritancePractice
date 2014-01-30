

package my.concrete;
import java.util.Scanner;

public class HourlyEmployee extends Employee {
        private double hourlyRate;
        private double totalHours;
        private double totalEarned;
        private String personFirstName;
        private String personLastName;
        private String personDept;
    
    public double main(String[] args){
        
        
        
        Scanner keyboard = new Scanner(System.in);
        
        Employee person1 = new Employee();
        
        System.out.println("Enter the employee's first name: ");
        personFirstName = keyboard.nextLine();
        
        person1.setFirstName(personFirstName);
        
        System.out.println("Enter the employee's last name: ");
        personLastName = keyboard.nextLine();
        
        person1.setLastName(personLastName);
        
        System.out.println("Enter the employee's Department: ");
        personDept = keyboard.nextLine();
        
        person1.setDepartment(personDept);
        
        System.out.println("Enter the employee's hourly rate of pay: ");
        hourlyRate = keyboard.nextDouble();
        
        System.out.println("Enter the number of hours the employee worked: ");
        totalHours = keyboard.nextDouble();
        
        totalEarned = totalHours * hourlyRate;
        
        System.out.print("Employee Name: " + person1.getFirstName() + " " + person1.getLastName() + "\n" + "Total Hours Worked: " + totalHours + "\n");
        System.out.print("Total wages earned: $" + totalEarned);
        
        return totalEarned;
    
    
    
}
}
