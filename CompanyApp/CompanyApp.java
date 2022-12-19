// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              App that uses employee, shift supervisor, production worker, teamleader, date and employeeId classes to simulate a company. 
// 

public class CompanyApp {
    public static void main(String[] args) {
        //initialize objects
        Employee[] myCompany = {
            new TeamLeader("Bob", new EmployeeId("463-B"), new Date(12, 21, 1999), 1, 21.5, 1350.5, 20, 15),
            new ProductionWorker("Bill", new EmployeeId("430-C"), new Date(10, 4, 2007), 2, 22),
            new ShiftSupervisor("Lebron", new EmployeeId("320-K"), new Date (9, 11, 2001), 55000, 2000),
            new Employee("Elon Mush", new EmployeeId("684-G"), new Date(12, 7, 2022)),
        };

        //sout io 
        System.out.println("My Company by M. Ly");
        System.out.println();
        for(Employee e : myCompany) {
            System.out.println(e);
            System.out.println("-------------------------");
        }

        //invalid ID
        System.out.println();
        System.out.println("Testing out invalid IDs");
        String[] faultyIds = {"342-a", "2342A", "293054904", "ASD36"};
        for(String badId : faultyIds) {
            System.out.println("Testing: " + badId);
            try {
                Employee karen = new TeamLeader("Karen", new EmployeeId(badId), new Date(12, 21, 1999), 1, 21.5, 1350.5, 20, 15);
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
            System.out.println("-------------------------");
        }

        //invalid date 
        System.out.println();
        System.out.println("Testing out invalid dates");
        //parallel arrays 
        int[] month = {1, 2, 4, 6, 7}; 
        int[] day = {0, 29, 32, 31, 50};
        int[] year = {1920, 2023, 3829, 5001, 2943}; 
        for(int i = 0; i < 5; i++) {
            System.out.printf("Testing: %02d-%02d-%04d\n", month[i], day[i], year[i]);
            try {
                Employee chad = new TeamLeader("Chad", new EmployeeId("463-B"), new Date(month[i], day[i], year[i]), 1, 21.5, 1350.5, 20, 15);
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
            System.out.println("-------------------------");
        }

        //invalid shift
        System.out.println();
        System.out.println("Testing out invalid shifts");
        int[] invalidShifts = {0, -1, 3, 4, 5};
        for(int val : invalidShifts) {
            System.out.println("Testing: " + val);
            try {
                Employee bob = new TeamLeader("Bob", new EmployeeId("452-B"), new Date(12, 21, 1999), val, 21.5, 1350.5, 20, 15);
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
            System.out.println("-------------------------");
        }
    }
}