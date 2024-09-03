package org.example;

import java.security.SecureRandom;

public class Main {
    static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@$%^&*";
    static final int ALLOWED_MINIMUM_LENGTH = 8;
    static SecureRandom randomSymbolPosition = new SecureRandom();
    public static void main(String[] args) {
        String randomPassword = "";
        //Here we generate the pass till it meets all the conditions
        while (!(isLengthCorrect(randomPassword)&&hasDigits(randomPassword)&&hasBothCases(randomPassword)&&isNotCommonUsed(randomPassword)&&hasSpecialCharacters(randomPassword))) {
            randomPassword = randomPass(ALLOWED_CHARACTERS,ALLOWED_MINIMUM_LENGTH);
        }
        //And print the pass and the all the checks out.
        checkAllTheConditions(randomPassword);

//        System.out.println(isLengthCorrect("12345678"));
//        System.out.println(hasDigits("jk1jlkjlkj"));
//        System.out.println(hasBothCases("Njklkj"));
//        System.out.println(hasBothCases("AUB&T3MWEU"));
//        System.out.println(isNotCommonUsed("qwerty123"));
//        System.out.println(isNotCommonUsed("GoodPassword01928374"));
//        System.out.println(hasSpecialCharacters("sjhgdfjshdgf&skdf"));
//        System.out.println(hasSpecialCharacters("hoiehsow,"));
    }

    //This method check all the conditions and print it out.
    public static void checkAllTheConditions(String password) {
        System.out.println("The password is: "+ password +
                "\nThe length is correct: " + isLengthCorrect(password) +
                "\nPass has digits: " + hasDigits(password) +
                "\nPass has both cases: " + hasBothCases(password) +
                "\nPass is not common used: " + isNotCommonUsed(password) +
                "\nPass has special characters: " + hasSpecialCharacters(password));
    }

    //This method generates a random password
    public static String randomPass(String symbols, int requiredLength){
        StringBuilder resultPassword = new StringBuilder(requiredLength);
        for (int i = 0; i < requiredLength; i++) {
            resultPassword.append(symbols.charAt(randomSymbolPosition.nextInt(symbols.length())));
        }
        return resultPassword.toString();
    }

    //This method checks the length
    public static boolean isLengthCorrect(String password) {
        return password.length() >= ALLOWED_MINIMUM_LENGTH;
    }

    //This method checks if pass contains digits
    public static boolean hasDigits(String password) {
        boolean hasDigits = false;
        for(int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))) {
                hasDigits = true;
                break;
            }
        }
        return hasDigits;
    }

    //This method checks if the pass contains both upper and lower cases
    public static boolean hasBothCases(String password) {
        boolean hasUpperCase = false, hasLowerCase = false;
        for(int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
            }
            if(Character.isLowerCase(password.charAt(i))) {
                hasLowerCase = true;
            }
        }
        return hasUpperCase && hasLowerCase;
    }

    //This method checks if the pass is not common used
    public static boolean isNotCommonUsed(String password) {
        String[] commonUsedPasses = {"Password1","Password123","Aa345678","qwerty123"};
        for(String pass : commonUsedPasses) {
            if(password.equals(pass)) {
                return false;
            }
        }
        return true;
    }

    //This method checks if the pass has special characters
    public static boolean hasSpecialCharacters(String password) {
        return !password.matches("[a-zA-Z]+");
    }
}