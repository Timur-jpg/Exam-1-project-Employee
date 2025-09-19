/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    
    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        fullname = fullname;
        yearOfBirth = yearOfBirth;
        hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    } 
    
    // q11 
    // private string fullname;
        // }
            // getFullname = fullname
        // }
        // private string name; 
        // }
            // setFullname = writeFullname
        // }
        
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // q12
        // }
          // if int age ≥ 16then 
             // return = can drive
          // else 
             // return = 16 - age
        // }
        return true;
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
    // q13 
    // int salary = calculatePay();
    // Get Pay = hyWage x unpaindHours
    // Set PayAfterTaxes = 70% x pay
    // Total print = payAfterTaxes
    return 0;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // q14  
        // Calculate Pay = Print Fullname + Salary
        // After pay = Reset to 0
    }
}