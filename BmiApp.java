import java.util.Scanner;

public class BmiApp
{
    public static void main (String[] args)
    {
        //create scanner object 
        Scanner keyboard = new Scanner(System.in);

        //prompts user for input
        System.out.print("Enter the height in feet and inches? ");
        int feet = keyboard.nextInt();
        int inches = keyboard.nextInt();
        
        System.out.print("Enter the weight(lbs)? ");
        double weight = keyboard.nextDouble();

        //calculate bmi 
        double bmi; 
        int HeightInches = feet * 12 + inches;
        bmi = (weight * 703) / (HeightInches * HeightInches);

        //output bmi and meaning
        System.out.println();
        System.out.printf("BMI = %.1f\n", bmi);
        
        if (bmi < 18.5)
        {
            System.out.println("Thin");
        } 
        else if (bmi >= 18.5 && bmi < 25)
        {
            System.out.println("Healthy");
        }
        else if (bmi >= 25 && bmi < 30)
        {
            System.out.println("Overweight");
        }
        else 
        {
            System.out.println("Obese");
        }       
    }
}