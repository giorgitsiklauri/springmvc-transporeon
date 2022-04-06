package com.transporeon.springmvc.model;

public class Person {

    private String firstname;
    private String lastname;
    private Integer age;
    private String position;

    public Person() {

    }

    public Person(String firstname, String lastname, Integer age, String position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.position = position;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

