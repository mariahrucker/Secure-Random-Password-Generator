import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

    @Test
    public void testGeneratePassword() {
        int length = 12;
        String password = PasswordGenerator.generatePassword(length);
        
        // Check password length
        assertEquals(length, password.length());

        // Check password contains at least one uppercase character
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        assertTrue(hasUppercase);

        // Check password contains at least one lowercase character
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        assertTrue(hasLowercase);

        // Check password contains at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        assertTrue(hasDigit);

        // Check password contains at least one symbol
        boolean hasSymbol = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSymbol = true;
                break;
            }
        }
        assertTrue(hasSymbol);
    }
}
