package com.bcafinance.fundamental.day4;/*
Created By IntelliJ IDEA 2022.2.3 (Comunity Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Azim a.k.a. Azim
Java Developer
Create on 10/11/2022
@Last Modified 10/11/2022 13:58
Version 1.0
*/

public class soal1 {
    public static void main(String[] args) {
        int intArr[]={3,8,5,2,1,9,10};
        int intB = 8;
        boolean isFound = true;
        //====
        for(int i=0; i<intArr.length; i++){
            if(intB == intArr[i]){
                System.out.println("Angka "+intB+" sudah ditemukan pada index ke-"+i);
                isFound = false;
            }
        }

        if(isFound==true){
            System.out.println("Angka "+intB+" tidak ditemukan !");
        }
    }
}
