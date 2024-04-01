package ru.diana.employee_retings.service;

public class EmployeeCreation {
    private String name;
    private int mark;

    public EmployeeCreation(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getNames() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public String toString() {
        return name + " - " + mark;
    }
}
