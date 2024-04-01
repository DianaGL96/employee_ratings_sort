package ru.diana.employee_retings.main;

import ru.diana.employee_retings.service.EmployeeCreation;
import ru.diana.employee_retings.service.EmployeeResult;

public class Main {
    public static void main(String[] arr) {
        String[] name = {"Artem", "Ruslan", "Tim", "Anton", "Max"};
        int[] mark = {40, 80, 76, 53, 61};
        EmployeeCreation[] employeeCreations = new EmployeeCreation[name.length];
        for (int i = 0; i < name.length; i++) {
            employeeCreations[i] = new EmployeeCreation(name[i], mark[i]);
        }
        EmployeeResult.printResult(employeeCreations);
    }
}
