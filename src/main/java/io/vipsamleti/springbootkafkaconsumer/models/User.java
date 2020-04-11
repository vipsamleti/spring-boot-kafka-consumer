package io.vipsamleti.springbootkafkaconsumer.models;

public class User {

    private String name;
    private String department;

    public User() {
    }

    public User(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
