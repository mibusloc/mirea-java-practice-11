package ru.mirea.lab11.task1;

import java.util.Date;

public class Developer {
    private final String name;
    private final Date startDate;
    private final int daysToComplete;

    public Developer(String name, Date startDate, int daysToComplete) {
        this.name = name;
        this.startDate = startDate;
        this.daysToComplete = daysToComplete;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getDeadlineDate() {
        long deadlineMillis = startDate.getTime() + (long) daysToComplete * 24 * 60 * 60 * 1000;
        return new Date(deadlineMillis);
    }
}