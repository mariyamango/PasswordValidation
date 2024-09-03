package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    //isLengthCorrect
    @Test
    void isLengthCorrect_expectTrueWhenLength8(){
        //Given
        String password = "asdkghjk";
        //When
        //Then
        Assertions.assertTrue(Main.isLengthCorrect(password));
    }
    @Test
    void isLengthCorrect_expectFalseWhenLength5(){
        //Given
        String password = "lkjhg";
        //When
        //Then
        Assertions.assertFalse(Main.isLengthCorrect(password));
    }
    @Test
    void isLengthCorrect_expectTrueWhenLength50(){
        //Given
        String password = "lkjhgwn7fisdpf,fnsljdfnsjdfkfnh8eusdfsdfsdfsdfsdfg";
        //When
        //Then
        Assertions.assertTrue(Main.isLengthCorrect(password));
    }

    //hasDigits
    @Test
    void hasDigits_expectTrueWhenHasOneDigit(){
        //Given
        String password = "asdkghjk1";
        //When
        //Then
        Assertions.assertTrue(Main.hasDigits(password));
    }
    @Test
    void hasDigits_expectFalseWhenHasNoDigits(){
        //Given
        String password = "asdkghjk";
        //When
        //Then
        Assertions.assertFalse(Main.hasDigits(password));
    }
    @Test
    void hasDigits_expectTrueWhenHasFiveDigits(){
        //Given
        String password = "a5s32dkgh4jk1";
        //When
        //Then
        Assertions.assertTrue(Main.hasDigits(password));
    }

    //hasBothCases
    @Test
    void hasBothCases_expectTrueWhenHasBothCases(){
        //Given
        String password = "Asdkghjk";
        //When
        //Then
        Assertions.assertTrue(Main.hasBothCases(password));
    }
    @Test
    void hasBothCases_expectFalseWhenHasNoLetters(){
        //Given
        String password = "57938745983457934,-*";
        //When
        //Then
        Assertions.assertFalse(Main.hasBothCases(password));
    }
    @Test
    void hasBothCases_expectFalseWhenHasOneCase(){
        //Given
        String password = "JLSKDFHLSKDFHLSF";
        //When
        //Then
        Assertions.assertFalse(Main.hasBothCases(password));
    }

    //isNotCommonUsed
    @Test
    void isNotCommonUsed_expectFalseWhenIsCommonUsed(){
        //Given
        String password = "Password1";
        //When
        //Then
        Assertions.assertFalse(Main.isNotCommonUsed(password));
    }
    @Test
    void isNotCommonUsed_expectTrueWhenIsNotCommonUsed(){
        //Given
        String password = "GooooodPass0981234756";
        //When
        //Then
        Assertions.assertTrue(Main.isNotCommonUsed(password));
    }

    //hasSpecialCharacters
    @Test
    void hasSpecialCharacters_expectTrueWhenHasSlash(){
        //Given
        String password = "ushfkjsfb/knl";
        //When
        //Then
        Assertions.assertTrue(Main.hasSpecialCharacters(password));
    }
    @Test
    void hasSpecialCharacters_expectFalseWhenHasNoSpecChars(){
        //Given
        String password = "ushfkjknl";
        //When
        //Then
        Assertions.assertFalse(Main.hasSpecialCharacters(password));
    }
}