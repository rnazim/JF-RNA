package com.bcafinance.fundamental.ujian1;/*
Created By IntelliJ IDEA 2022.2.3 (Comunity Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Azim a.k.a. Azim
Java Developer
Create on 11/11/2022
@Last Modified 11/11/2022 14:47
Version 1.0
*/

import java.util.Random;

public class SoalDua {
    public static void main(String[] args) {
        String strV = "aiueo";
        String strKonso = "bcdfghjklmnpqrstvwxyz";

        char[] arrV = strV.toCharArray();
        char[] arrK = strKonso.toCharArray();

        String strA ="abcdefghijklmnopqrstuvwxyz";
        char[] arrA = strA.toCharArray();
        String strOutput ="";
        Random rand = new Random();

        int tmp = rand.nextInt(2);

        for(int i=0; i<rand.nextInt(10,50); i++){
            if(i<5){
                if(tmp==1){
                    tmp=2;
                    strOutput += arrK[rand.nextInt(21)];
                }else{
                    tmp=1;
                    strOutput += arrV[rand.nextInt(5)];
                }
            }else{
                strOutput += arrA[rand.nextInt(26)];
            }
        }
        System.out.println(strOutput.substring(0,1).toUpperCase()+strOutput.substring(1));
    }
}
