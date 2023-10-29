package ru.mirea.lab11.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String currentDateString = dateFormat.format(currentDate);

        System.out.println("Текущая дата: " + currentDateString);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате дд.мм.гггг): ");
        String userInput = scanner.nextLine();

        Date userDate = dateFormat.parse(userInput);

        currentDate = dateFormat.parse(dateFormat.format(currentDate));

        if (currentDate.before(userDate)) {
            System.out.println("Введенная дата находится в будущем.");
        } else if (currentDate.equals(userDate)) {
            System.out.println("Введенная дата совпадает с текущей датой.");
        } else {
            System.out.println("Введенная дата находится в прошлом.");
        }
    }
}
