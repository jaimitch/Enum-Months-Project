package com.example;


import com.example.Month;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.asList(Month.values()));

        System.out.print("Enter a month");

        String month =  input.next();

        Month.valueOf(month.toUpperCase());
        ArrayList<String> months = new ArrayList<>();



        switch (com.example.Month.valueOf(month.toUpperCase())){
            case JANUARY:
                months.add(Month.JANUARY.getEnglishName());
            case FEBRUARY:
                months.add(Month.FEBRUARY.getEnglishName());
            case MARCH:
                months.add(Month.MARCH.getEnglishName());
            case APRIL:
                months.add(Month.APRIL.getEnglishName());
            case MAY:
                months.add(Month.MAY.getEnglishName());
            case JUNE:
                months.add(Month.JUNE.getEnglishName());
            case JULY:
                months.add(Month.JULY.getEnglishName());
            case AUGUST:
                months.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER:
                months.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER:
                months.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER:
                months.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER:
                months.add(Month.DECEMBER.getEnglishName());

                System.out.println(months);
        }
    }
}
