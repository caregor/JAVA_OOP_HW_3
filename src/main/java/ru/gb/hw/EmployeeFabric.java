package ru.gb.hw;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    private static String[] generateName(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int nameIndex = random.nextInt(names.length);
        int surnameIndex = random.nextInt(surnames.length);
        return new String[]{names[nameIndex], surnames[surnameIndex]};
    }

    public static Worker generateWorker(){
        String[] nameAndSurname = generateName();
        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 65);
        return Worker.create(nameAndSurname[1], nameAndSurname[0], age, salary);
    }
    private static Freelancer generateFreelancer() {
        String[] nameAndSurname = generateName();
        int hourRate = random.nextInt(13, 56);
        int age = random.nextInt(18, 65);
        return Freelancer.create(nameAndSurname[1], nameAndSurname[0], age, hourRate);
    }
    /**
     * Done: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            if (Math.random() < 0.5) {
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }
}
