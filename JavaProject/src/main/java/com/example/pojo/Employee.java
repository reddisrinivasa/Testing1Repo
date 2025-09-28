package com.example.pojo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private LocalDate dateOfJoin;
    private double salary;
    private Department department;

    public Employee(int id, String name, int age, LocalDate dateOfJoin, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoin = dateOfJoin;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Dept: " + department.getDeptName() + ")";
    }
}






//class Employee{
//      int id;
//    String name;
//    int age;
//    String gender;
//    Department department;
//    int yearOfJoining;
//    double salary;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Employee(int id, String name, int age, String gender, Department department, int yearOfJoining, double salary) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.department = department;
//        this.yearOfJoining = yearOfJoining;
//        this.salary = salary;
//    }
//}
//
//public List<Employee> getYoungestEmployee(Eemplyee eemplyee)
//        List<Employee> list = new ArrayList<>();
//eemplyee.stream().filter(Comparator.compare(,b)?
//                         )
////Youngest Male employee in Product Development Department
