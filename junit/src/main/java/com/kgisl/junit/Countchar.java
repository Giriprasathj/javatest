package com.kgisl.junit;

import java.util.Scanner;

class Countchar {
    private static String string;

    public static void main(String[] args) {
        String firstname;
        String secondname;

        firstname = "Kari";
        secondname = "Laitinen";

        {

            System.out.println("Ënter the firstname :");
            Scanner input1 = new Scanner(System.in);
            String firstname1 = input1.next();

            int count = 0;
            System.out.println("String: " + firstname);
            for (int i = 0; i < firstname.length(); i++) {
                if (Character.isLetter(firstname.charAt(i)))
                    count++;
            }
            System.out.println("Letters: " + count);

            //.....................//
{
            System.out.println("Enter the secondname :");
            Scanner input2 = new Scanner(System.in);
            String secondname2 = input2.next();
            
            System.out.println("String: " + secondname);
            for (int i = 0; i < secondname.length(); i++) {
                if (Character.isLetter(secondname.charAt(i)))
                    count++;

            }
            System.out.println("Letters: " + count);
        }

    }
}}