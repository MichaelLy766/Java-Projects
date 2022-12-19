// 
//  Name:        Ly, Michael 
//  Homework:    5
//  Due:         11/28/2022 
//  Course:      cs-1400-03-f22 
// 
//  Description: 
//               Application that fill tanks of car and displays readings of the car's fuel level and
//               mileage at 15 mile increments until the car runs out of fuel. 
// 

public class CarInstrumentSimulator 
{
    public static void main(String[] args)
    {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(21000);
        //OR odometer.setMileage(21000);

        //filing car up with fuel
        while (fuelGauge.getFuelAmount() < fuelGauge.getMaxFuel()) {
            fuelGauge.addFuel();
        } 
        //OR fuelGauge.fillTank(); 

        //I/O
        System.out.println("Car Instrument Simulator by M. Ly");
        System.out.println();
        System.out.println("Fuel Level    Odometer");
        System.out.println("----------    --------");

        //outputs readings every 15 miles
        while(fuelGauge.getFuelAmount() > 0)
        {
            if(odometer.getMileage() % 15 == 0) {
                System.out.printf("    %2d        %6d\n",
                    fuelGauge.getFuelAmount(), odometer.getMileage());
            }
            odometer.addMileage();
            odometer.burnFuel(fuelGauge);
        }
        if (fuelGauge.getFuelAmount() == 0)
            System.out.printf("    %2d        %6d\n",
                fuelGauge.getFuelAmount(), odometer.getMileage());
        System.out.println("...until runs out of fuel");
    }   
}