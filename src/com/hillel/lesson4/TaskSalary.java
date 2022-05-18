package com.hillel.lesson4;

public class TaskSalary {

    public static void main(String[] args) {

        float employee1 = 4000;
        float employee2 = 2900;
        float employee3 = 8200;

        System.out.println("зарплата за 10 лет сотрудник 1 - " + employee1 * 120);
        System.out.println("зарплата за 10 лет сотрудник 2 - " + employee2 * 120);
        System.out.println("зарплата за 10 лет сотрудник 3 - " + employee3 * 120);


        System.out.println("зарплата за 10 лет сотрудник 1 - налог - 5% - " + (employee1 * 120) /100 * 5);
        System.out.println("зарплата за 10 лет сотрудник 1 - налог 5% - " + (employee2 * 120) /100 * 5);
        System.out.println("зарплата за 10 лет сотрудник 1 - налог - 5% - " + (employee3 * 120) /100 * 5);
        System.out.println("средняя зарплата всех сотрудников за 10 лет после выплаты налогов - " + ((((employee1 * 120) /100 * 5) + (employee2 * 120) /100 * 5) + (employee3 * 120) /100 * 5) / 3 );




    }
}
