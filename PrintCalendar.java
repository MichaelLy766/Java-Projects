// 
//  Name:       Ly, Michael 
//  Project:    3 
//  Due:        10-19-22 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              This program prompts the user for the month and year, and uses that to create a 
//              formatted and accruate calendar in an output file.
// 

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintCalendar 
{
    public static void main (String[] args) throws IOException 
    {
        //prompt user for month and year 
        System.out.println("Calendar by M. Ly");
        System.out.println();
        System.out.print("Enter month year? ");
        Scanner keyboard = new Scanner(System.in);
        int month = keyboard.nextInt();
        int year = keyboard.nextInt(); 
        
        //intialize day to one to represent start of the month for getDayOfTheWeek method
        int day = 1; 

        //Create output file for output
        String fileName = month + "-" + year + ".txt";
        PrintWriter outputFile = new PrintWriter(fileName); 

        //writes calendar to output file 
        outputFile.println(getMonthName(month) + " " + year);
        outputFile.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        outputFile.println("---------------------------------");

        //print out skipped spaces and dates
        for (int i = 0; i < getDayOfTheWeek(day, month, year); i++)
        {
            outputFile.print("     ");
        }
        for (int i = 1; i <= getNumberOfDaysInMonth(month, year); i++)
        {
            if ((getDayOfTheWeek(day, month, year) + i) % 7 == 0)
            {
                outputFile.printf("%3d", i);
                outputFile.println(); 
            }
            else if (i == getNumberOfDaysInMonth(month, year))
            {
                outputFile.printf("%3d", i);
            }
            else
            {
                outputFile.printf("%3d  ", i);
            }
        }

        System.out.println();
        System.out.println(fileName + " generated.");
        outputFile.println(); 
        outputFile.close();
    }    

    static int getDayOfTheWeek (int day, int month, int year)
    {
        //return the day of the week, 0:sun, 1:mon, ..., 6:sat 
        int a = (14-month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2; 
        return (day + y + y/4 - y/100 + y/400 + 31 * m / 12) % 7;
    }

    static boolean isLeapYear (int year)
    {
        //return true if year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    static int getNumberOfDaysInMonth (int month, int year)
    {
        //return the number of days in a given month and year
        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 2:
                if (isLeapYear(year))
                {
                    return 29;
                }
                else 
                {
                    return 28; 
                }
            default: return 30;
        }
    }

    static String getMonthName (int month)
    {
        //return the name of the month, 1:January, 2:February, 
        //..., 12:December 
        switch (month)
        {
            case 1:
                return "January";
            case 2:
                return "Febuary";                        
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";  
            case 7:
                return "July";
            case 8:
                return "August";
            case 9: 
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }   
    }
}