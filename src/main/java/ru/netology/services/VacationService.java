package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {


            if (money >= threshold) { // отдыхаем
                int expensesTwo = (money - expenses) - (money - expenses) / 3; //сколько еще потратилось
                count++; //увеличиваем счётчик месяцев отдыха
                money = money - (expensesTwo + expenses);

            } else {
                money = income + money - expenses;
            }

        }
        return count;
    }
}
