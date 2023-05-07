# Secure Password Generator

Secure random password with characters from four different character groups: uppercase letters, lowercase letters, numbers, and symbols. At least one character from each character set is included in the password, and the remainder of the characters are chosen randomly from all character groups. To increase the security of the password, the characters are shuffled using the Fisher-Yates shuffle algorithm, which prevents the password from being predictable and provides it with maximum entropy.

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

In this example, the password will be 8 characters long.

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

## Features Developments

```Yaml
1. Select the length of their password
2. Include special characters, numbers, uppercase and/or lowercase letters
3. Choose to include words from a dictionary
4. Select a specific character set to use
5. Exclude certain characters from the generated password
6. Specify a minimum number of character types in the generated password
7. Specify a maximum number of consecutive identical characters in the generated password
8. Save their passwords for easy retrieval
```

## Security Considerations

Generating secure random passwords is an important aspect of cybersecurity. 

Here are some best practices to keep in mind:

- Use a cryptographically strong random number generator to generate passwords.
- Use a mixture of character sets (uppercase letters, lowercase letters, digits, symbols) to increase the entropy of the password.
- Avoid using predictable or easily guessable passwords, such as "password", "12345", or "qwerty".
- Use a password manager to store and manage your passwords securely.
- Set password expiration policies to ensure passwords are changed regularly.
- Make sure to use two-factor authentication whenever possible.
- Avoid using the same password for multiple accounts.

## License

Licensed under the MIT License. See the LICENSE file for more information.

## Contributions

Contributors: [klbaillie](https://github.com/klbaillie)

Contributions to this project are welcome! If you find a bug or want to suggest an improvement, please open an issue or a pull request on the GitHub repository.

## Credits

Created by Mariah Rucker.

## Contact

If you have any questions or concerns, please feel free to contact Mariah Rucker at mariahrucker@myyahoo.com.
