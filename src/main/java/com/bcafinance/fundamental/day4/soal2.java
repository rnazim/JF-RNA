package com.bcafinance.fundamental.day4;/*
Created By IntelliJ IDEA 2022.2.3 (Comunity Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Azim a.k.a. Azim
Java Developer
Create on 10/11/2022
@Last Modified 10/11/2022 14:36
Version 1.0
*/

public class soal2 {
    public static void main(String[] args) {
        int keyword = 99;
        int val[] = {66, 77, 80, 84, 88, 99, 100};

        int low = 0;
        int high = val.length-1;
        int med = 0;
        boolean status = false;

        while(low <= high) {
            med = (low + high) / 2;
            if (keyword == val[med]) {
                System.out.println(keyword + " FOUNDED in position " + (med + 1) + " and INDEX " + med);
                status = true;
                break;
            }else{
                if (keyword > val[med]) {
                    low = med + 1;
                } else {
                    high = med - 1;
                }
            }
        }

        if (status == false) {
            System.out.println(keyword + " NOT FOUND !!");
        }
    }
}
