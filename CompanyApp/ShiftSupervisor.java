// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class definning a shift supervisor, which is an employee, with additional salary and bonus fields, with constructors, 
//              setters and getters for fields, and toString override
// 

public class ShiftSupervisor extends Employee {
    private double salary; 
    private double bonus; 

    public ShiftSupervisor() {
        super(); 
        salary = 0;
        bonus = 0; 
    }

    public ShiftSupervisor(double salary, double bonus) {
        super();
        setSalary(salary);
        setBonus(bonus);
    }

    public ShiftSupervisor(String name, EmployeeId id, Date hireDate, double salary, double bonus) {
        super(name, id, hireDate);
        setSalary(salary);
        setBonus(bonus);
    }

    //setter
    public void setSalary(double salary) {
            this.salary = salary; 
    }

    public void setBonus(double bonus) {
            this.bonus = bonus; 
    }

    //getter
    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus; 
    }

    //toString
    public String toString () {
        return String.format("Name: " + super.getName() + "\nID: " + super.getId() + "\nHire Date: "
                             + super.getHireDate() + "\nSalary: " + salary + "\nbonus: " + bonus);
    }

}