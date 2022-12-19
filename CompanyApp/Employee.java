// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class definning an employee with name, id, hire date fields, with constructors, setters and getters for fields, and toString override
// 

public class Employee {
    //fields
    private String name;
    private EmployeeId id; 
    private Date hireDate; 

    //constructors
    public Employee() {
        name = null;
        id = null; 
        hireDate = null;
    }

    public Employee(String name, EmployeeId id, Date hireDate) {
        setName(name);
        setId(id);
        setHireDate(hireDate);
    }

    //mutators
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId (EmployeeId id) {
        this.id = id; 
    }

    public void setHireDate (Date hireDate) {
        this.hireDate = hireDate;
    }

    //accessors
    public String getName() {
        return name; 
    }

    public EmployeeId getId() {
        return id; 
    }

    public Date getHireDate() {
        return hireDate; 
    }

    //toString
    @Override
    public String toString() {
        return String.format("Name: " + name + "\nID: " + id + "\nHire Date: " + hireDate); 
    }
}