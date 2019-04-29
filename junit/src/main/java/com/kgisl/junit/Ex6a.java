package com.kgisl.junit;

import java.util.Arrays;
import java.util.List;

class Employee1 {
    
    public static void main(String[] args) {
        
        
        List<Employee> st1 = Arrays.asList(
            new Employee(1101, "IT ", "giri", 10000),
            new Employee(1102, "IT ", "sasi", 14000),
            new Employee(1103, "IT ", "sanjeev", 13000),
            new Employee(1104, "IT ", "kavin", 15000),
            new Employee(1105, "IT ", "gowtham", 1200));
            System.out.println(st1);
            
    
            // static void removeif(){
            //     System.out.println("******** removeif ********");
            //     names.removeIf( x -> x == "Sasi" );
            //     System.out.println(names);
            // }
    
    }
    }
    