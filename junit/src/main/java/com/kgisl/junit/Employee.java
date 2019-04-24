package com.kgisl.junit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee {
    private String empId;
    private String department;
    private String name;
    private Double salary;
  
    public Employee(int i, String department, String name, int j) {
        this.empId = empId;
        this.department = department;
        this.name = name;
        this.salary = salary;
       
    }
    // getters and toString
}
public static void main(String[] args) {
    

Employee a1= new Employee(1101, "IT ", "giri", 10000);
Employee a2= new Employee(1102, "IT ", "sasi", 12000);
Employee a3= new Employee(1103, "IT ", "sanjeev", 10000);
Employee a4= new Employee(1104, "IT ", "kavin", 111000);
Employee a5= new Employee(1105, "IT ", "gowtham", 12000);

List<Employee> employees = new ArrayList<Employee>();
employees.add(a1);
employees.add(a2);
employees.add(a3);
employees.add(a4);
employees.add(a5);

// Double totalSalary = employees.stream().collect(summingDouble(Employee::getSalary));
System.out.println(employees);
Collections.sort(employees);
System.out.println(employees);
    
}
}
