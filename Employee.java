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
    
    // Q11
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

        
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
    int age = 2025 - yearOfBirth;  
    
    if (age > 16) {
        System.out.println(fullname + " can drive in Canada.");
        return true;
    } else {
        int yearsToWait = 16 - age;
        System.out.println(fullname + " cannot drive yet. Needs to wait " + yearsToWait + " more year(s).");
        return false;
    }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
    // q13 
    // int salary = calculatePay();
    // Get Pay = hyWage x unpaindHours
    // Set PayAfterTaxes = 70% x pa
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