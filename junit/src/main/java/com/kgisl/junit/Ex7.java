package com.kgisl.junit;

import java.util.Scanner;

class Electricbill {
    public static void main(String[] args) {
    
        System.out.println("ELECTRIC BILL PAYMENT");
        Scanner a = new Scanner(System.in);

        System.out.println("Enter ID: ");
        int id = a.nextInt();

        System.out.println("Enter user name: ");
        int name = a.nextInt();

        System.out.println("Enter number of units used: ");
        float unit = a.nextFloat();

        if(unit <=199){
            float q=1.20f;
            float p=unit *q;
            System.out.println("\n"+"BILL RECEIPT :"+"\n"+"\n"+"Amount is Rs."+p+"\n"+"ID :"+id+"\n"+"User name :"+name+"\n"+"Units :"+unit);
        }
        else if(unit >=200 && unit<=400){
            float q=1.50f;
            float p=unit *q;
            System.out.println("\n"+"BILL RECEIPT :"+"\n"+"\n"+"Amount is Rs."+p+"\n"+"ID :"+id+"\n"+"User name :"+name+"\n"+"Units :"+unit);
        }
        else if(unit >=400 && unit<=600){
            float q=1.80f;
            float p=unit *q;
            System.out.println("\n"+"BILL RECEIPT :"+"\n"+"\n"+"Amount is Rs."+p+"\n"+"ID :"+id+"\n"+"User name :"+name+"\n"+"Units :"+unit);
        }
        else if(unit>600){
            float q=2.0f;
            float p=unit *q;
            System.out.println("\n"+"BILL RECEIPT :"+"\n"+"\n"+"Amount is Rs."+p+"\n"+"ID :"+id+"\n"+"User name :"+name+"\n"+"Units :"+unit);
            

        
        if (p >=400) {
            float Discount=p-15/100;
            System.out.println("\n"+"the Discount amount :"+Discount);
        }}

        }


        }


        
    
    

