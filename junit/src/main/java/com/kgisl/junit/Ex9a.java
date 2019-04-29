// package com.kgisl.junit;

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;

// class Employee1 {
//     private static final Collection<Employee> St1 = null;

//     public static void main(String[] args) {

//         List<Employee> st1 = Arrays.asList(
//                 new Employee(1101, "ECE", "giri", 14000),
//                 new Employee(1102, "ECE", "sasi", 14000),
//                 new Employee(1103, "ECE", "sanjeev", 13000),
//                 new Employee(1104, "IT", "kavin", 15000),
//                 new Employee(1105, "IT", "gowtham", 12000),
//                 new Employee(1105, "IT", "kannan", 16000));
    

//         System.out.println("total salary of all employees");
//         double a1 = st1.stream().mapToDouble(Employee::getSalary).sum();
//         System.out.print(a1);

//         System.out.print("\nTotal Salary of ECE dept: ");
//         Predicate<Employee> pre = x -> x.getDept() == "ECE";
//         List<Employee> a2 = st1.stream().filter(pre).collect(Collectors.toList());
//         double a3 = a2.stream().mapToDouble(Employee::getSalary).sum();
//         System.out.print(a3);

//         System.out.print("\n Total Salary of IT dept: ");
//         Predicate<Employee> pred=x->x.getDept()=="IT";
//         List<Employee>f4=st1.stream().filter(pred).collect(Collectors.toList());
//         double f5=f4.stream().mapToDouble(Employee::getSalary).sum();
//         System.out.print(f5);

//         st1.stream().max(Comparator.comparing(z -> z.getSalary() + "dept:" + z.getDept()))
//         .ifPresent(m->System.out.println("\n Dept highest Salary:"+m));

//         st1.stream().min(Comparator.comparing(z -> z.getSalary() + "dept:" + z.getDept()))
//         .ifPresent(m->System.out.println("\n Dept highest Salary:"+m));

//     }

// }
