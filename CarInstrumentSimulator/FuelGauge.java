// 
//  Name:       Ly, Michael 
//  Homework:   5
//  Due:        11/28/2022
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class that has fields and methods related to a fuelguage such as fillTank, burnFuel, and getFuelAmount.   
// 

public class FuelGauge 
{

    private final int MAX_FUEL = 15; 
    private int gallonsOfFuel; 

    public FuelGauge()
    {
        gallonsOfFuel = 0; 
    }

    public FuelGauge(int FuelAmount)
    {
        gallonsOfFuel = FuelAmount; 
    }

    public void setFuelAmount(int FuelAmount)
    {
        gallonsOfFuel = FuelAmount; 
    }

    //method to get amount of fuel 
    public int getFuelAmount()
    {
        return gallonsOfFuel; 
    }

    public int getMaxFuel ()
    {
       return MAX_FUEL; 
    }

    //able to increment fuel amount
    public void addFuel()
    {
       gallonsOfFuel = gallonsOfFuel + 1;
    }

    //fill tank directly
    public void fillTank() 
    {
        while(gallonsOfFuel < MAX_FUEL)
        {
            gallonsOfFuel++; 
        }
    }

    //able to decrement fuel amount
    public void burnFuel()
    {
        if(gallonsOfFuel > 0) {
            gallonsOfFuel--; 
        }
    }
}