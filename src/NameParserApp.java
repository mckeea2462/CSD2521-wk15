// This is Step 4's comment

/*
Name: Andrew McKee
Date: 11/22/2022
Purpose: The program prompts the user to enter a name. If they enter two names, the program will treat it as a first name
         and last name. If they enter three names, the program will treat it as a first name, middle name, and last name.
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calls Console to get user's name input
        String name = Console.getString("Enter a name: ");
        System.out.println();
        
        // Trims spaces from the name variable
        name = name.trim();
        
        // The statements below perform checks.
        // If the user enters nothing or only spaces, it prints an error message.
        // If the user enters only one name, it prints an error message.
        // If the user enters more than three name, it prints an error message.
        // If the user enters more than one space between a name, it prints an error message.
        // If the user enters two names, it assumes the first name/last name format, and prints it.
        // If the user enters three names, it assumes the first name/middle name/last name format, and prints it.
        int index1 = name.indexOf(" ");
        if (index1 == -1) {
            System.out.println("Name not in valid format.");
        }
        else {
            int index2 = name.indexOf(" ", index1 + 1);
            if (index2 == -1) {
                String firstName = name.substring(0, index1);
                String lastName = name.substring(index1 + 1);
                System.out.println("First name:   " + firstName);
                System.out.println("Last name:   " + lastName);
            }
            else {
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstName = name.substring(0, index1);
                    String middleName = name.substring(index1 + 1, index2);
                    String lastName = name.substring(index2 + 1);
                    
                    System.out.println("First name:   " + firstName);
                    System.out.println("Middle name:   " + middleName);
                    System.out.println("Last name:   " + lastName);
                }
                else {
                    System.out.println("Name not in valid format.");
                }
            }
        }
    }
}
