package com.bridgelabz.classtest;

import java.util.Scanner;

public class ClassTest {
    public static void coupanNumber(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for(int i=1;i<=n;i++){
            int randm=(int) (Math.random());
            if(temp!=randm){
                System.out.println(randm);
            }
            temp=randm;
        }


    }
    public static void stopWatchProgram(){
        int counter=1;
        for(int i=1;i<=10;i++){
            System.out.println(i);
            counter++;
        }
        System.out.println("elapsed time "+counter);
    }
    public static void main(String[] args) {
        System.out.println("class test");

     coupanNumber();
     stopWatchProgram();
    }
}
