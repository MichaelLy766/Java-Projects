// 
//  Name:       Ly, Michael 
//  Homework:   3
//  Due:        10/17/22 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              This program prompts the user for a file name, reads doubles from that file,
//              counts the total number of doubles in that file, and computes the sum and average of the doubles. 
// 

import java.util.Scanner;
import java.io.File;
import java.io.IOException; 

public class StatApp
{
    public static void main(String[] args) throws IOException
    {
        //create scanner and file objects 
        Scanner keyboard = new Scanner(System.in);

        //prompts user for input 
        System.out.println("Stats by M. Ly");
        System.out.println();
        System.out.print("Enter the data file name? ");
        
        //open file for reading
        File myFile = new File(keyboard.next());

        //reading data from file while counting and summing 
        Scanner inputFile = new Scanner(myFile); 

        int counter = 0; 
        double total = 0;

        while(inputFile.hasNext())
        {
            counter++;
            total += inputFile.nextDouble();
        }
        
        //close file 
        inputFile.close(); 

        //output count, total and average  
        System.out.println();
        System.out.printf("Count:   %3d\n", counter);
        System.out.printf("Total:   %6.1f\n", total);

        //averaging computation and output 
        System.out.printf("Average: %6.1f\n", total / counter); 
        
    }
}