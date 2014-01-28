

package my.concrete;
import java.util.Scanner;
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    public static void main(String[]args){
        double salary;
        double weeklyPay;
        double weeklyCommission;
        String personFirstName;
        String personLastName;
        String personDept;
        
        Scanner keyboard = new Scanner(System.in);
        
        Employee person = new Employee();
        
        System.out.println("Enter the employee's first name: ");
        personFirstName = keyboard.nextLine();
        
        person.setFirstName(personFirstName);
        
        System.out.println("Enter the employee's last name: ");
        personLastName = keyboard.nextLine();
        
        person.setLastName(personLastName);
        
        System.out.println("Enter the employee's Department: ");
        personDept = keyboard.nextLine();
        
        person.setDepartment(personDept);
        
        System.out.println("Enter the Employee's salary: $");
        salary = keyboard.nextDouble();
        
        System.out.println("Enter the commission earned by the employee for the week: $");
        weeklyCommission = keyboard.nextDouble();
        
        weeklyPay = (salary/26) + weeklyCommission;
        
        System.out.print("Employee name: " + person.getFirstName() + " " + person.getLastName() + "\n");
        System.out.print("Employee Department: " + person.getDepartment() + "\n");
        System.out.print("Employees weekly pay: #" + weeklyPay + "\n");
        
    }
}
