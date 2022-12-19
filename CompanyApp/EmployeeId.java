// 
//  Name:       Ly, Michael 
//  Project:    5 
//  Due:        12-07-2022 
//  Course:     cs-1400-03-f22 
// 
//  Description: 
//              Class definning an EmployeeId with an id field, with constructors, setters and getters for the field, and toString override.
//              Throws exception if id entered is not in correct format. 
// 

public class EmployeeId {
    private String id; 

    public EmployeeId() {
        id = null; 
    }

    public EmployeeId(String id) {
        setEmployeeId(id);
    }

    //setter and getter
    public void setEmployeeId(String id) {
        if (isValidId(id)) {
            this.id = id; 
        } else {
            throw new IllegalArgumentException("Invalid ID"); 
        }
    } 

    public String getEmployeeId() {
        return id; 
    }

    @Override
    public String toString() {
        return id; 
    }

    //exception handling 
    public boolean isValidId(String id) {
        boolean valid = true;
        if (id.length() != 5) {
            valid = false;
        }
        for(int i = 0; i < 3; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                valid = false; 
            } 
        }
        if (id.charAt(3) != '-') {
            valid = false;
        }
        if (!('A' <= id.charAt(4) && id.charAt(4) <= 'M')) {
            valid = false; 
        }
        return valid; 
    }
}