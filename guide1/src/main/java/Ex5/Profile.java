package Ex5;

import java.util.Date;

public class Profile {
    private String firstName;
    private String lastName;
    private String dni;
    private String arrivalDateAndTime;
    private Role role;

    public Profile(String firstName, String lastName, String dni, String arrivalDateAndTime, Role role) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;
            //validateDNI(dni);
            this.dni = dni;
            //validateArrivalDateTime(arrivalDateAndTime);
            this.arrivalDateAndTime = arrivalDateAndTime;
            this.role = role;
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    private void validateDNI(String dni) throws RuntimeException{
        String regex = "^\\d{8}$";
        if (!dni.matches(regex)) {
            throw new RuntimeException("DNI not valid");
        }
    }
    private void validateArrivalDateTime(String arrivalDateAndTime) throws RuntimeException{
        String regex = "^\\d{2}/\\d{2}/\\d{4}, \\d{2}:\\d{2}$";
        if (!dni.matches(regex)) {
            throw new RuntimeException("date or time not valid");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public String getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public Role getRole() {
        return role;
    }




}
