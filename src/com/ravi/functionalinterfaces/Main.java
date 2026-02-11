package com.ravi.functionalinterfaces;

import java.util.List;

import static com.ravi.functionalinterfaces.FunctionalInterfacesExample.staticDisplay;

public class Main {

    /*@Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b){
        return a-b;
    }*/

    public static void main(String[] args) {
        /*FunctionalInterfacesExample functionalInterfacesExample = new FunctionalInterfacesExample() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }

            @Override
            public int sub(int a, int b){
                return a-b;
            }
        };*/
        //System.out.println(functionalInterfacesExample.sum(10, 20));

        FunctionalInterfacesExample functionalInterfacesExample = (a, b) -> a+b;
        System.out.println(functionalInterfacesExample.sum(20, 20));
        functionalInterfacesExample.display();
        staticDisplay();

        FunctionalInterfacePrintTenNumbers tenNumbers = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

       tenNumbers.printTenNumbers();

       FunctionalInterfaceExample2 example2 = name -> name;
        System.out.println(example2.getName("Ravi Teja"));

       List<String> names = List.of("Ravi", "Sai", "Santhosh", "Pavan", "Suresh");

       names.forEach(name -> {
           System.out.println(name);
       });

        //(param1, param2 ....) -> { body };
    }
}
