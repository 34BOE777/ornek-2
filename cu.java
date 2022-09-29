package com.company;

import java.util.Scanner;
/* Dizinin elemanları bir adım öne kaydıran ve birinci elemanı sıfırlayan kod */
public class Main {

    public static void main(String[] args) {
	int a[]={4,8,3,1,18,9,21,20,5,17};
    //Scanner s =new Scanner(System.in);
    //int n=s.nextInt();
    int k = a[0];


    for(int i=1;i<a.length;i++){
     a[i-1]=a[i];
    }
    a[a.length-1]=k;
    //a[0]=0;
    for(int x:a){
        System.out.println(x);
    }
    }
}
