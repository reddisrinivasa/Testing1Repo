package com.example;

import com.example.pojo.Department;
import com.example.pojo.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class YoungestEmployeeFinder {
    public static void main(String args[]) {
        Department d1 = new Department(101, "HR");
        Department d2 = new Department(102, "IT");
        Department d3 = new Department(103, "Finance");
        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", 25,
                        LocalDate.of(2022, 1, 10), 50000, d1),
                new Employee(2, "Raj", 31,
                        LocalDate.of(2017, 4, 11), 60000, d1),
                new Employee(8, "Raghav", 65,
                        LocalDate.of(2005, 6, 15), 75000, d2),
                new Employee(12, "Suresh", 74,
                        LocalDate.of(2022, 8, 23), 29000, d2),
                new Employee(7, "Rajesh", 75,
                        LocalDate.of(2022, 3, 13), 34000, d3),
                new Employee(23, "Puneeth", 39,
                        LocalDate.of(2022, 11, 14), 45000, d3));
        // Group by department, then find youngest employee in each dept
        Map<Department, Optional<Employee>> youngestByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
        //Print results
        youngestByDept.forEach((department, employee) -> System.out.println("Youngest in "
                + department + "-> " + employee.orElse(null)));
    }
}

