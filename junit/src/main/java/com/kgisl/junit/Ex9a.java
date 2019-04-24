package com.kgisl.junit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private static final Collection<Employee> St1 = null;

    public static void main(String[] args) {
    
        List<Employee> st1 = Arrays.asList(
                new Employee(1101, "IT ", "giri", 10000),
                new Employee(1102, "IT ", "sasi", 14000),
                new Employee(1103, "IT ", "sanjeev", 13000),
                new Employee(1104, "IT ", "kavin", 15000),
                new Employee(1105, "IT ", "gowtham", 12000));
    
                // int total = St1.stream()
                // .collect(Collectors.summingInt(Employee::gettotal);
                // system.out.println("Total Employees Salary : " + total);
    
               
            //     Long total = st1.stream().collect(
            //         Collectors.summingLong(Employee::gettotal));
            // System.out.println("Total Employees Salary : " + total);

            
            //Double totalSalary = st1.stream().collect(summingDouble(Employee::getSalary));
            

        
               
        }
    
       
        }
    