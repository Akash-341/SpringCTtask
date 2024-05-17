package com.example.springcttask.Activity;

public class EmployeeModel {
    String name;
    String age;
    String address;
    String city;

    public EmployeeModel(String name, String age, String address, String city) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
