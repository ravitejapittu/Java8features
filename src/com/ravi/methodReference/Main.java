package com.ravi.methodReference;

public class Main {

    public void sayingSomething(){
        System.out.println("Say Something");
    }

    public static void main(String[] args) {
        Test3 test3 = Message::new;
        test3.message("Hi There");
        Main main = new Main();
        Test2 test2 = main::sayingSomething;
        Test test = MethodReferences::display;
        test.display();
        test2.say();
    }
}
