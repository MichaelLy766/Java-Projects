// 
//  Name:   Ly, Michael 
//  Project:  4 
//  Due:         11/2/2022
//  Course:  cs-1400-03-f22 
// 
//  Description: 
//    This is a class that contains fields, a final constant, a constructor, and methods for accelerating 
//    and braking the car. Theere is also toString overidding. 
//

public class Car 
{
    //fields
    private int yearModel, speed;
    private String make; 
    private final int MAX_SPEED = 180; 

    //constructor
    public Car(int yearModel, String make)
    {
        this.yearModel = yearModel;
        this.make = make; 
        speed = 0;
    }

    //Accessors 
    public int getYearModel()
    {
        return yearModel;
    }
    public String getMake()
    {
        return make;
    }
    public int getSpeed()
    {
        return speed;
    }

    //other methods
    public void accelerate()
    {
        if (speed < MAX_SPEED)
        {
            speed += 5;
        }
    }
    public void brake()
    {
        if (speed > 0)
        {
            speed -= 5;
        }
    }

    @Override
    public String toString() 
    {
        return String.format("%4d   %20s    %3d", yearModel, make, speed);
    }
}
