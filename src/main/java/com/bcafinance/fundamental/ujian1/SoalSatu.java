package com.bcafinance.fundamental.ujian1;/*
Created By IntelliJ IDEA 2022.2.3 (Comunity Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Azim a.k.a. Azim
Java Developer
Create on 11/11/2022
@Last Modified 11/11/2022 13:40
Version 1.0
*/

import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        int intTotal = 0 ;
        boolean isAgain = true;
        Scanner sc = new Scanner(System.in);
        try{
            do{
                System.out.print("Masukan angka sepuasnya : ");
                int intNumber = sc.nextInt();
                intTotal += intNumber;
            }while(isAgain==true);

        }
        catch(Exception e){
            isAgain = false;
            if(isAgain==false){
                System.out.print("Jumlah "+intTotal);
            }
        }
    }
}
