package com.example.Java8;
//List the items
//Even or odd numbers
//count the numbers
//count the employees department wise
//Map and FlatMap examples
//Keys and values

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressionsDemo {
    public static void main(String args[]) {
        // fruits array
        //List<String> fruits = Arrays.asList("apple", "banana", "orange",
        //        "apple", "banana", "apple");
     /*   // list the items one by one using stream
        fruits.forEach(n-> System.out.println(n));
        System.out.println();
        //filter the items
        fruits.stream().filter(n->n.contains("Apple"))
                .forEach(n-> System.out.println(n));
        fruits.stream().filter(n->n.startsWith("Apple"))
                .forEach(n-> System.out.println(n));
        //remove duplicates from the list
        System.out.println();
       // fruits.stream().distinct().forEach(n-> System.out.println(n));
       List<String> uniqueList = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
        System.out.println();
        //find duplicate items list
        Set<String> duplicateElements = fruits.stream().filter(n-> Collections.frequency(fruits, n)>1)
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements in the list:: "+duplicateElements);
*/
        //count the items
       /* final Map<String, Long> frequencyMap  = fruits.stream().collect(Collectors
                .groupingBy(s -> s, Collectors.counting()));
        System.out.println("colect:::"+frequencyMap);
        System.out.println();

        //duplicate items count
        final Set<String> duplicateElements = frequencyMap.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements ::"+duplicateElements);*/
        /*List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        List<Integer> eventNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Even numbers:: "+eventNumbers);
        System.out.println("oddNumbers numbers:: "+oddNumbers);*/
        /*List<Employee> employees = Arrays.asList(new Employee(101, "Ramu", "IT", 5000),
                new Employee(101, "Koti", "Sales", 6000),
                new Employee(101, "Poori", "Networking", 5000),
                new Employee(101, "Sultan", "Marketing", 18000),
                new Employee(101, "Ravi", "IT", 14000),
                new Employee(101, "Joshi", "Marketing", 9000),
                new Employee(101, "Pandu", "Sales", 12000)
        );
       // get the highest salary departmentwise
        final Map<String, Optional<Employee>> highestSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        //print results

        // Print results
        highestSalaryByDept.forEach((dept, emp) -> System.out.println(dept +" ->"+ emp.get().toString()));
    }
}
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return name + "(" + department + ", " +salary+ ")"; */
        //even numbers with their square values

      /*  List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream().filter(n->n%2 == 0).map(n->n*n).forEach(System.out::println);*/
        //method reference
//        List<String> names = Arrays.asList("A","B","C");
//        names.stream().forEach(System.out::println);
        List<List<String>> data = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C","D"));
       // data.stream().map(row->String.join(" ",row)).forEach(System.out::println);
        //data.stream().map(List::stream).count();
        //System.out.println(data.stream().flatMap(List::stream).count());
        data.stream().flatMap(List::stream).forEach(System.out::println);


    }
}
