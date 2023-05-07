package securerandompasswordgenerator;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordGenerator {
    // Define character sets
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*_=+-/";

    // Combine all character sets into one string
    private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SYMBOLS;

    // Create a secure random number generator
    private static final SecureRandom random = new SecureRandom();
    

    public static void main(String[] args) {
        // Define password length
        int length = 12;

        // Generate a password and print it
        String password = generatePassword(length);
        System.out.println("Generated password: " + password);
    }

    static String generatePassword(int length) {
        // Create an array to hold the password characters
        char[] password = new char[length];
        int index = 0;

        // Add one character from each character set to the password
        password[index++] = pickRandom(UPPER);
        password[index++] = pickRandom(LOWER);
        password[index++] = pickRandom(DIGITS);
        password[index++] = pickRandom(SYMBOLS);
        
        //Prompts user options
        System.out.println("Would you like a custom character?");
        Scanner input = new Scanner(System.in);
        String custom = input.nextLine();
        
        //Enables user choice
        if (custom.equals("YES") || custom.equals("Yes") || custom.equals("yes")){
            password[index++] = special();
            for (; index < length; ++index) {
                password[index] = pickRandom(ALL_CHARS);
                }
        }
        else{
             // Add remaining characters to the password
            for (; index < length; ++index) {
                password[index] = pickRandom(ALL_CHARS);
                }
        }

        // Shuffle the password characters to increase randomness
        for (int i = length - 1; i > 0; --i) {
            int j = random.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        // Convert the password character array to a string and return it
        return new String(password);
    }

    private static char pickRandom(String str) {
        // Pick a random character from the given string
        int index = random.nextInt(str.length());
        return str.charAt(index);
    }
    
    //allow a user to specify a character they want to include
    private static char special() {
        System.out.println("Enter a character you would like included: ");
        Scanner input = new Scanner(System.in);
        char c = input.nextLine().charAt(0);
        
        
        return c;
    }
}
