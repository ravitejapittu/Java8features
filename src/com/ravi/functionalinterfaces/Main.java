package com.ravi.functionalinterfaces;

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

        FunctionalInterfacePrintTenNumbers tenNumbers = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

       tenNumbers.printTenNumbers();

        //(param1, param2 ....) -> { body };
    }
}
