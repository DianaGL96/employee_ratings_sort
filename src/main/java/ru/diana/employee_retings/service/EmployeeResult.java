package ru.diana.employee_retings.service;

public class EmployeeResult {
    public static void bubbleSort(String[] name, int[] mark) {
        int n = name.length;
        int temp;
        String temp1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (mark[j] > mark[j + 1]) {
                    temp = mark[j];
                    mark[j] = mark[j + 1];
                    mark[j + 1] = temp;
                    temp1 = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp1;
                }
            }
        }
    }

    public static void printResult(EmployeeCreation[] employeeCreations) {
        String[] name = new String[employeeCreations.length];
        int[] mark = new int[employeeCreations.length];
        for (int i = 0; i < employeeCreations.length; i++) {
            name[i] = employeeCreations[i].getNames();
            mark[i] = employeeCreations[i].getMark();
        }
        System.out.println("Employees - Marks\n");
        for (EmployeeCreation element : employeeCreations) {
            System.out.println(element.getNames() + " - " + element.getMark());
        }
        bubbleSort(name, mark);
        System.out.println("\nSorted list\n");
        System.out.println("Employees - Marks\n");
        for (int i = 0; i < employeeCreations.length; i++) {
            System.out.println(name[i] + " - " + mark[i]);
        }
    }
}
