package com.ymmihw.core;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressionWithYieldAndArrow {
    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {

        String result = switch (month) {
            case JANUARY, FEBRUARY, MARCH -> {
                //multiple statements can be used here
                yield "First Quarter";
            }
            case APRIL, MAY, JUNE -> {
                //multiple statements can be used here
                yield "Second Quarter";
            }
            case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
            case OCTOBER, NOVEMBER, DECEMBER -> {
                //multiple statements can be used here
                yield "Forth Quarter";
            }
            default -> "Unknown Quarter";
        };
        System.out.println(result);
    }
}