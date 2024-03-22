package ru.gb.hw;

/**
 * Фрилансер (работник с почасовой оплатой)
 * DONE: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {
    private double hRate;
    private Freelancer(String surName, String name, int age, double hR) {
        super(surName, name, age, hR);
        this.hRate = hR;
    }
    public static Freelancer create(String surName, String name, int age, double hR){
        return new Freelancer(surName, name, age, hR);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hRate;
    }
    @Override
    public String toString() {
        return String.format("%s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, age, hRate, calculateSalary());
    }
}
