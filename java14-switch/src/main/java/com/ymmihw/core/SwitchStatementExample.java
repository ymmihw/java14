package com.ymmihw.core;

import java.time.LocalDate;
import java.time.Month;

public class SwitchStatementExample {
    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {
        switch (month) {
            case JANUARY, FEBRUARY, MARCH -> System.out.println("First Quarter");//no break needed
            case APRIL, MAY, JUNE -> System.out.println("Second Quarter");
            case JULY, AUGUST, SEPTEMBER -> System.out.println("Third Quarter");
            case OCTOBER, NOVEMBER, DECEMBER -> System.out.println("Forth Quarter");
            default -> System.out.println("Unknown Quarter");
        }
    }
}