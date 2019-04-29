// package com.kgisl.junit;

// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.stream.Collectors;

// class Employee1 {

//     public static void main(String[] args) {

//         List<Employee> st1 = Arrays.asList(
//                 new Employee(2, "ZCE", "giri", 14000),
//                 new Employee(3, "IT", "kavin", 15000),
//                 new Employee(5, "IT", "gowtham", 12000),
//                 new Employee(1, "IT", "sasi", 12000),
//                 new Employee(4, "IT", "kannan", 16000));
    

//                 System.out.println("sort by Name");
//                 List<Employee> c = st1.stream().sorted(Comparator.comparing(Employee::getDept))
//                 .collect(Collectors.toList());
         
//                 c.forEach(System.out::println);

    
//             System.out.println("sort by Empid");
//             List<Employee> a = st1.stream().sorted(Comparator.comparing(Employee::getEmpid))
//             .collect(Collectors.toList());
     
//             a.forEach(System.out::println);

//             System.out.println("sort by Salary");
//             List<Employee> b = st1.stream().sorted(Comparator.comparing(Employee::getSalary))
//             .collect(Collectors.toList());
     
//             b.forEach(System.out::println);

            
           



//     }


// }
