package Ex5;

import java.util.Scanner;

public class Main {
    static AccessManager accessManager;
    public static void main(String[] args){
        accessManager = new AccessManager();
        selectOperation();
    }

    private static void selectOperation() {
        System.out.println("Select operation: ");
        System.out.println("1: Register Access | 2: Exit");
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        switch (input){
            case 1 ->{
                accessManager.registerEntrance();
                selectOperation();
            }
            case 2 ->{
                accessManager.closeAccess();
                System.exit(0);
            }
            default -> {
                System.out.println("Please enter a valid input");
                selectOperation();
            }
        }
    }

}
