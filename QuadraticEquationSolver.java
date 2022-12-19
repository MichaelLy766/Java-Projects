// 
//  Name:   Ly, Michael 
//  Project:  1
//  Due:        9/26/22 
//  Course:  cs-1400-03-f22 
// 
//  Description: 
//    This project requires the program to prompt the user for the coefficients a, b, and c of a 
//    quadratic equation ax^2 + bx + c = 0 and print out the solutions. It assumes that the coefficients 
//    a, b, and c will ensure two real roots. 
// 

import java.util.Scanner;

public class QuadraticEquationSolver 
{
    public static void main(String[] args)
    {
        //declare doubles 
        double a, b, c; 
        
        //create scanner object 
        Scanner keyboard = new Scanner(System.in);

        //prompt user for a, b, and c
        System.out.println("Quadratic Equation Solver by M. Ly");
        System.out.println();
        System.out.print("Enter a? ");
        a = keyboard.nextDouble(); 

        System.out.print("Enter b? ");
        b = keyboard.nextDouble(); 

        System.out.print("Enter c? ");
        c = keyboard.nextDouble(); 

        //apply formula to a, b, and c 
        double discrim = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(discrim)) / (2 * a);
        double x2 = (-b - Math.sqrt(discrim)) / (2 * a);
        
        //print out x1 and x2
        System.out.println();
        System.out.println("The solutions:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2); 
    }
}
