// 
//  Name:       Ly, Michael 
//  Homework:   4 
//  Due:        11/09/2022
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              This is the class Element which has fields atomic number and name, a contructor
//              along with setters and getters for methods. It also has its own toString method. 
// 

public class Element
{   
    //fields
    private int atomicNo;
    private String name;

    //constructor 
    public Element(int aN, String name)
    {
        atomicNo = aN;
        this.name = name;
    }

    //other methods
    public int getAtomicNo()
    {
        return atomicNo;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return String.format("%4d  %-20s", atomicNo, name);
    }
}