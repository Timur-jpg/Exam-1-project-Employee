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
    private double calculatePay() {
    // q13  
    double grossPay = hourlyWage * unpaidHours;   
    double netPay = grossPay * 0.7;               
    return netPay;
    }
    
    public void addUnpaidHours(double hours) {
    unpaidHours += hours;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // q14 
    double salary = calculatePay();
    System.out.println(fullname + " has received a wire transfer of " + salary + " CAD.");
    unpaidHours = 0.0;
    
    }
}