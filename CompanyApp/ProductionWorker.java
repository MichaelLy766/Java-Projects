// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class definning a production worker, which is an employee, with additional shift and payRate fields, with constructors, 
//              setters and getters for fields, and toString override
// 

public class ProductionWorker extends Employee {
    private int shift;
    private double payRate; 

    public ProductionWorker() {
        super(); 
        shift = 0;
        payRate = 0; 
    } 
    
    public ProductionWorker(int shift, double payRate) {
        super(); 
        setShift(shift);
        setPayRate(payRate);
    }

    public ProductionWorker(String name, EmployeeId id, Date hireDate, int shift, double payRate) {
        super(name, id, hireDate);
        setShift(shift);
        setPayRate(payRate);
    }

    //setters 
    public void setShift(int shift) {
        if (shift > 0 && shift < 3) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException("Invalid Shift"); 
        }
    }

    public void setPayRate(double payRate) {
            this.payRate = payRate; 
    }

    //getter
    public int getShift() {
        return shift;
    }

    public double getPayRate() {
        return payRate; 
    }

    //toString 
    public String toString () {
        return String.format("Name: " + super.getName() + "\nID: " + super.getId() + "\nHire Date: "
                             + super.getHireDate() + "\nShift: " + shift + "\nPay Rate: " + payRate);
    }
}