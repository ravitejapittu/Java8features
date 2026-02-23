package com.ravi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("123", "Ravi Teja", "raviteja@gamil.com", 33));
        employeeList.add(new Employee("124", "Sai Krishna", "sai@gmai.com", 28));
        employeeList.add(new Employee("125", "Santhosh", "santhosh@gmai.com", 30));
        employeeList.add(new Employee("126", "Suresh", "suresh@gmai.com", 33));
        employeeList.add(new Employee("127", "Pavan", "pavan@gmai.com", 27));

        /*List<Employee> newList = new ArrayList<>();
        for (Employee e : employeeList){
            if(e.getAge()<=30){
                newList.add(e);
            }
        }
        for (Employee e : newList){
            System.out.println(e.getId()+" "+e.getName()+" "+e.getEmailId()+ " "+ e.getAge());
        }*/

        employeeList.stream().filter(employee -> employee.getName().startsWith("S"))
                .forEach(e -> System.out.println(e.getId()+" "+e.getName()+" "+e.getEmailId()+ " "+ e.getAge()));

        employeeList.stream().map(Employee::getName).forEach(System.out::println);

        Stream.iterate(1, element->element+1)
                .filter(element->element%2==1)
                .limit(10)
                .forEach(System.out::println);

        //filteredList.stream().forEach(e -> System.out.println(e.getId()+" "+e.getName()+" "+e.getEmailId()+ " "+ e.getAge()));
    }
}
