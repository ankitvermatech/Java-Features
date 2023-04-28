package com.ankittech.lambdaExp;

public class Timesheet {
    int eno;
    int days;

    public Timesheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "eno=" + eno +
                ", days=" + days +
                '}';
    }
}
