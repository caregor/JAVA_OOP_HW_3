package ru.gb.hw;

public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Возраст
     */
    protected int age;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    public Employee(String surName, String name, int age, double salary) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
