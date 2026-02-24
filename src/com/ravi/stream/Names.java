package com.ravi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class Names {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("123", "Ravi Teja", "raviteja@gamil.com", 33));
        employeeList.add(new Employee("129", "Ravi Teja", "ravi@gamil.com", 20));
        employeeList.add(new Employee("124", "Sai Krishna", "sai@gmai.com", 28));
        employeeList.add(new Employee("125", "Santhosh", "santhosh@gmai.com", 30));
        employeeList.add(new Employee("128", "Santhosh", "santhosh1@gmai.com", 20));
        employeeList.add(new Employee("126", "Suresh", "suresh@gmai.com", 33));
        employeeList.add(new Employee("127", "Pavan", "pavan@gmai.com", 27));

        employeeList.stream().collect(groupingBy(Employee::getName, counting()))
                .entrySet().forEach(e -> System.out.println(e.getKey()+" - "+e.getValue()));
        /*List<String> names = Arrays.asList("Apple", "Orange", "Banana", "Apple", "Grape", "Orange");
        //names.stream().distinct().forEach(System.out::println);
        names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .forEach((e -> System.out.println(e.getKey())));*/
    }
}
