# Secure Password Generator

This Java code generates a secure random password that is composed of characters from four different character sets: uppercase letters, lowercase letters, digits, and symbols. The generated password contains at least one character from each set, and the remaining characters are selected randomly from all character sets.

To make the password even more secure, the code shuffles the characters using the Fisher-Yates shuffle algorithm. This ensures that the password is not predictable and has maximum entropy.

The code uses the `SecureRandom` class from the `java.security` package, which provides a cryptographically strong random number generator. This is important for generating secure passwords that cannot be easily guessed or hacked.

## Usage

To use the password generator, simply call the `generatePassword()` method from your Java code:

```java
String password = PasswordGenerator.generatePassword();
```

You can also specify the length of the password by passing an integer argument to the `generatePassword()` method:

```java
String password = PasswordGenerator.generatePassword(12);
```

In this example, the password will be 12 characters long.

**Example**

```
How many random passwords would you like to generate?
5
What should be the minimum length of each password?
8
What should be the maximum length of each password?
12

Generating 5 random passwords...
1. g2P6W#7V
2. T4s9Xq3pM
3. JcF3$Sf7
4. N8fH!xZm
5. 9Eh@1fWm

Done!
```

## Security Considerations

Generating secure random passwords is an important aspect of cybersecurity. Here are some best practices to keep in mind:

- Use a cryptographically strong random number generator to generate passwords.
- Use a mixture of character sets (uppercase letters, lowercase letters, digits, symbols) to increase the entropy of the password.
- Avoid using predictable or easily guessable passwords, such as "password", "12345", or "qwerty".
- Use a password manager to store and manage your passwords securely.

## License

This code is licensed under the MIT License. See the LICENSE file for more information.

## Contributions

Contributions to this project are welcome! If you find a bug or want to suggest an improvement, please open an issue or a pull request on the GitHub repository.

## Credits

This code was created by Mariah Rucker.

## Contact

If you have any questions or concerns, please feel free to contact Mariah Rucker at mariahrucker@myyahoo.com.
