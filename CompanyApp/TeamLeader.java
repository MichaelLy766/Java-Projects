// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class definning an team leader, which is a production worker, with additional monnthly bonus, training hours required,
//              training hours attended fields, with constructors, setters and getters for fields, and toString override
// 

public class TeamLeader extends ProductionWorker {
    private double monthlyBonus; 
    //training hours 
    private int hrsReq;
    private int hrsAtt; 

    //constructors 
    public TeamLeader() {
        super(); 
        monthlyBonus = 0;
        hrsReq = 0;
        hrsAtt = 0;
    }

    public TeamLeader(int shift, double payRate, double monthlyBonus, int hrsReq, int hrsAtt) {
        super(shift, payRate); 
        setMonthlyBonus(monthlyBonus);
        setHrsReq(hrsReq);
        setHrsAtt(hrsAtt);
    }

    //can you call super super? 
    public TeamLeader(String name, EmployeeId id, Date hireDate, int shift, double payRate, double monthlyBonus, int hrsReq, int hrsAtt) {
        super(name, id, hireDate, shift, payRate); 
        setMonthlyBonus(monthlyBonus);
        setHrsReq(hrsReq);
        setHrsAtt(hrsAtt);
    } 

    //setters
    public void setMonthlyBonus(double monthlyBonus) {
            this.monthlyBonus = monthlyBonus; 
    }

    public void setHrsReq(int hrsReq) {
            this.hrsReq = hrsReq;
    }

    public void setHrsAtt(int hrsAtt) {
        this.hrsAtt = hrsAtt; 
    }

    //getters
    public double getMonthlyBonus() {
        return monthlyBonus;
    } 

    public int getHrsReq() {
        return hrsReq;
    }

    public int getHrsAtt() {
        return hrsAtt; 
    }

    //toString
    public String toString () {
        return String.format("Name: " + super.getName() + "\nID: " + super.getId() + "\nHire Date: "
                             + super.getHireDate() + "\nShift: " + super.getShift() + "\nPay Rate: " + super.getPayRate()
                             + "\nMonthly Bonus: " + monthlyBonus + "\nTraining Hours Required: " + hrsReq 
                             + "\nTraining Hours Attended: " + hrsAtt);
    } 
}