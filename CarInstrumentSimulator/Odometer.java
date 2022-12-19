// 
//  Name:        Ly, Michael 
//  Homework:    5
//  Due:         11/28/2022 
//  Course:      cs-1400-03-f22 
// 
//  Description: 
//               Odometer class with methods that tracks mileage, sets mileage, and one that interacts
//               with the FuelGuage object to burn feul. 
// 

public class Odometer 
{   
    //know car's current mileage
    private int mileage;
    private final int MAX_MILEAGE = 999999; 
    private final int MPG = 24; 

    public Odometer ()
    {
        mileage = 0;
    }

    public Odometer (int mileage)
    {
        this.mileage = mileage; 
    }

    public void setMileage(int mileage)
    {
        this.mileage = mileage; 
    }

    //report car current mileage
    public int getMileage()
    {
        return mileage; 
    }

    //incrementing mileage and working with FuelGauge
    public void addMileage() 
    {
        mileage = mileage + 1;
        if(mileage > MAX_MILEAGE)
        {
            mileage = 0; 
        }
    }

    public void burnFuel(FuelGauge object)
    {
        if(mileage % MPG == 0)  
        {                
            object.burnFuel(); 
        }
    }
}