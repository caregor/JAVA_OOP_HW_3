package ru.gb.hw;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee worker : employees) {
            System.out.println(worker);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println();
        System.out.println("***");
        System.out.println();

        for (Employee worker : employees) {
            System.out.println(worker);
        }

    }
}
