package org.example;

import java.util.Scanner;

import static org.example.appLogin.*;


public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String username = "";
        String passWord = "";
        String phoneNumber = "";



       username =  Username(myScanner, username);
        passWord = userPassword(myScanner, passWord);
       phoneNumber = cellPhoneNumber(myScanner,phoneNumber, username, passWord);
        checkUserName(username);
        checkPasswordComplexity( passWord);
        registerUser(username, passWord,phoneNumber,myScanner);


        boolean login = loginUser(username, passWord);
       String loginStatus =  returnLoginStatus(myScanner,login);
       System.out.println(loginStatus);

    }

    private static String Username(Scanner myScanner, String username) {
        //username
         System.out.println("Enter your username(Must be less than Five characters and must contain an Underscore):");
           username = myScanner.nextLine();
        if (checkUserName(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println( "Username is not correctly formatted, please ensure that your username " +
                    "contains an underscore and is no more than five characters in length.");

        }
        return username;

    }

    //password
    private static String userPassword(Scanner myScanner, String passWord) {
         System.out.println("Enter your Password(Ensure that the password contains at least eight characters,a capital letter, a number and a special character.):");
          passWord = myScanner.nextLine();
        if (checkPasswordComplexity(passWord)) {
                System.out.println( "Password successfully captured.");

            } else {
                System.out.println( "Password is not correctly formatted, please ensure that the password contains at least eight characters," +
                        " a capital letter, a number and a special character. ");


            }
        return passWord;

        }

    // Cellphone number
    private static String cellPhoneNumber(Scanner myScanner, String phoneNumber, String username, String passWord) {
        System.out.println("Enter your phone number(With the country code):");
         phoneNumber = myScanner.nextLine();
        if (checkPhoneNumber(phoneNumber)) {                                                                            //(OpenAi,2025)
            System.out.println( "Cellphone number successfully added");

        } else {
            System.out.println("Phone number is not correctly formatted or does not contain international code.");

        }
        return phoneNumber;


    }


    public static boolean checkUserName(String username) {

        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String passWord) {

        return passWord.length() >= 8 &&
                passWord.matches(".*[A-Z].*") &&
                passWord.matches(".*[0-9].*") &&
                passWord.matches(".*[!@#$%^&*()_+].*");
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return  phoneNumber.length() == 12 && phoneNumber.startsWith("+27");
    }

    public static String registerUser(String username, String passWord, String phoneNumber,Scanner myScanner) {
        if (!checkUserName(username)) {
            return "The username is incorrect";
        }

        if (!checkPasswordComplexity(passWord)) {
            return "The password does not meet complexity requirements";
        }

        if (!checkPhoneNumber(phoneNumber)) {
            return "The phone number is incorrectly formatted";

        } if (checkUserName(username)&& checkPasswordComplexity(passWord) && checkPhoneNumber(phoneNumber)) {
                System.out.println("User successfully registered");

            }else{
                System.out.println("User not registered successfully ");
            }


            return "The user is registered successfully";


    }
}

   // Code attribution 1
   //This method was taken from W3 Schools
   // https://www.w3schools.com/java/java_conditions.asp
   // N/A
   //

   // Code attribution 2
   // This method was taken from W3 Schools
   // https://www.w3schools.com/java/java_user_input.asp#gsc.tab=0
   // N/A
   //

   // Code attribution 3
   // This method was taken from W3 Schools
   // https://www.w3schools.com/js/js_comparisons.asp
   // N/A
   //

   // Code attribution 4
   // This method was taken from W3 Schools
   // https://www.baeldung.com/java-lowercase-uppercase-special-character-digit-regex
   // N/A
   //

