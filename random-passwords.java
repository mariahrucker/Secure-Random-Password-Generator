```java
import java.security.SecureRandom;
import java.util.Arrays;

public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*_=+-/";

    private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SYMBOLS;

    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int length = 12;
        String password = generatePassword(length);
        System.out.println("Generated password: " + password);
    }

    private static String generatePassword(int length) {
        char[] password = new char[length];
        int index = 0;

        password[index++] = pickRandom(UPPER);
        password[index++] = pickRandom(LOWER);
        password[index++] = pickRandom(DIGITS);
        password[index++] = pickRandom(SYMBOLS);

        for (; index < length; ++index) {
            password[index] = pickRandom(ALL_CHARS);
        }

        // Shuffle the password characters
        for (int i = length - 1; i > 0; --i) {
            int j = random.nextInt(i + 1);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        return new String(password);
    }

    private static char pickRandom(String str) {
        int index = random.nextInt(str.length());
        return str.charAt(index);
    }
}
```

This code generates a secure random password by selecting characters from four different character sets: uppercase letters, lowercase letters, digits, and symbols. The generated password must contain at least one character from each set, and the remaining characters are selected randomly from all character sets.
To make the password even more secure, the code shuffles the characters using the Fisher-Yates shuffle algorithm. This ensures that the password is not predictable and has maximum entropy. The code uses the `SecureRandom` class from the `java.security` package, which provides a cryptographically strong random number generator. This is important for generating secure passwords that cannot be easily guessed or hacked. Overall, this code demonstrates how to generate secure random passwords in Java, which is a crucial aspect of cybersecurity.
