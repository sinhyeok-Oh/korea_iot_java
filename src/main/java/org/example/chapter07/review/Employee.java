package org.example.chapter07.review;

public class Employee {
    private final String employeeId;
    private String name;
    private String position;
    private int salary;

    public Employee(String employeeId, String name, String position, int salary ) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;

    }

    String getEmployeeId () {
        return employeeId;
    }

    String getName () {
        return name;
    }

    String getPosition () {
        return position;
    }

    int  getSalary () {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        if (salary >= 0 ) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }
    public void displayInfo() {
        System.out.println();

    }
}
