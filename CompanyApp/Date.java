// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class definning a date with month, date, year fields, with constructors, setters and getters for fields, and toString override.
//              throw IllegalArgumentException if invalid date is entered.
// 

public class Date {
    private int hireDateMonth;
    private int hireDate;
    private int hireDateYear;  

    public Date() {
        hireDateMonth = 1;
        hireDate = 1;
        hireDateYear = 1900;
    }

    public Date(int month, int date, int year) {
        setDate(month, date, year);
    }

    //setter and getter
    public void setDate (int month, int date, int year) {
        if (isValidDate(month, date, year)) {
            hireDateMonth = month;
            hireDate = date;
            hireDateYear = year; 
        } else {
            throw new IllegalArgumentException("Invalid Date"); 
        }
    }

    public String getDate() {
        return String.format("%02d-%02d-%04d", hireDateMonth, hireDate, hireDateYear); 
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", hireDateMonth, hireDate, hireDateYear);
    }

    //exception handling
    public boolean isValidDate(int month, int date, int year) {
        if (!(month <= 12 && month > 0)) {
            return false; 
        } else if (!(year <= 5000 && year >= 1900)) {
            return false; 
        } else if (!(date > 0 && date <= getNumberOfDaysInMonth(month, year))) {
            return false; 
        } else {
            return true; 
        }
    }

    public boolean isLeapYear (int year)
    {
        //return true if year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getNumberOfDaysInMonth (int month, int year)
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
}