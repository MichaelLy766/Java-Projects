// 
//  Name:   Ly, Michael 
//  Project:  4
//  Due:        11-02-2022 
//  Course:  cs-1400-03-f22 
// 
//  Description: 
//    This program creates an array of 8 cars that has a make and year model, assigns a
//    random speed to each car through a loop, then outputs status of the 8 cars. 
// 

import java.util.Random; 

public class RacingCarApp
{
    public static void main (String[] args)
    {
        Random rand = new Random(); 

        //Instantiate an array of 8 Cars of your choice. 
        Car[] arrayCars = {
            new Car(2023,"Ford F150"),
            new Car(2011,"Toyata Camry"),
            new Car(2004,"Honda Accord"),
            new Car(2007,"Chevorlet Corvette"),
            new Car(1990,"Dodge Charger"),
            new Car(2019,"Subaru Outback"),
            new Car(2020,"Jeep Cherokee"),
            new Car(1970,"Volkswagen Beetle"),
        };        

        //Randomizer loop for speed
        for (int i = 1; i <= 30; i++)
        { 
            for (int j = 0; j < arrayCars.length; j++)
            {
                if (rand.nextInt(20) + 1 <= 18)
                {
                    arrayCars[j].accelerate(); 
                }
                else 
                {
                    arrayCars[j].brake();
                }
            }
        }

        //out the final status of each car
        System.out.println("Racing Car by M. Ly");
        System.out.println();
        System.out.println("Model  Make                  Speed");
        System.out.println("-----  --------------------  -----");
        for (int i = 0; i < arrayCars.length; i++)
        {
            System.out.println(arrayCars[i]);
        }
    }
}