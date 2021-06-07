package com.ymmihw.core;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressionWithYield {
    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {

        String result = switch (month) {
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                //multiple statements can be used here
                yield "First Quarter";
            case APRIL:
            case MAY:
            case JUNE:
                //multiple statements can be used here
                yield "Second Quarter";
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                //multiple statements can be used here
                yield "Third Quarter";
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                //multiple statements can be used here
                yield "Forth Quarter";
            default:
                yield "Unknown Quarter";
        };
        System.out.println(result);
    }
}