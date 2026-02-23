package com.ravi.stream;

public class Employee {
    private String id;
    private String name;
    private String emailId;
    private int age;

    public Employee(String id, String name, String emailId, int age) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAge() {
        return age;
    }
}
