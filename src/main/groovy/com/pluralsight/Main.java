package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // asking variables
        Scanner scanner = new Scanner(System.in);
        String firstName = enterData("Enter your first name: ").trim();
        String middleName = enterData("Enter your Middle name initial (If no middle name just enter): ").trim();
        String lastName = enterData("Enter your last name: ").trim();
        String suffix = enterData("Enter your suffix (If no suffix just enter: ").trim();

        String fullName = firstName; //checking if middle name and suffix
        if (middleName.length() > 0) {
            fullName = firstName + " " + middleName +".";
        }
        fullName = fullName + " " + lastName;
        if (!suffix.isEmpty()) { //use this to check if suffix empty
            fullName = fullName + " " + "," + suffix ;
        }  {
            System.out.print("Your full name is " + fullName );


        }




        }  private static String enterData (String data){
            Scanner scanner = new Scanner(System.in);
            System.out.print(data + " ");
            return scanner.nextLine();
    }         }




        // creating private to ask input

