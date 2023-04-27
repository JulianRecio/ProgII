package Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccessManager {
    private List<Profile> profiles;

    public AccessManager() {
        profiles = new ArrayList<>();
    }

    public void registerEntrance(){
        Scanner profileReader = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = profileReader.nextLine();
        System.out.println("Enter last name: ");
        String lastName = profileReader.nextLine();
        System.out.println("Enter DNI: ");
        String dni = profileReader.nextLine();
        System.out.println("Enter arrival date & time: ");
        String arrivalDateTime = profileReader.nextLine();
        Role role = selectRole();
        Profile profile = new Profile(firstName, lastName, dni, arrivalDateTime, role);
        profiles.add(profile);
    }

    private Role selectRole() {
        System.out.println("Enter role: 1 | employee, 2| visitor");
        Scanner profileReader = new Scanner(System.in);
        int input = profileReader.nextInt();
        switch (input){
            case 1 -> {
                return Role.EMPLOYEE;
            }
            case 2 -> {
                return Role.VISITOR;
            }
            default -> {
                System.out.println("Please enter a valid number!");
                System.out.println("----------------------------");
                selectRole();
            }
        }
        return null;
    }

    public void closeAccess(){
        System.out.println("Number of people who accessed the institution today: " + profiles.size());
        for (Profile profile : profiles) {
            System.out.println("First name: " + profile.getFirstName() + ", Last name: " + profile.getLastName());
        }
        profiles.clear();
    }
}
