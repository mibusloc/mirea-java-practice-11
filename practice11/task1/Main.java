package ru.mirea.lab11.task1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Developer[] developers = {
                new Developer("Первый Разраб", new Date(), 7),
                new Developer("Второй Разраб", new Date(), 5),
                new Developer("Ласт Разраб", new Date(), 6)
        };

        for (Developer developer : developers) {
            System.out.println("Фамилия разработчика: " + developer.getName());
            System.out.println("Дата и время получения задания: " + developer.getStartDate());
            System.out.println("Дата и время сдачи задания: " + developer.getDeadlineDate());
            System.out.println();
        }
    }
}
