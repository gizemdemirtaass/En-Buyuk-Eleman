package com.company;

public class Main {

    public static void main(String[] args) {
	double n1=5, n2=2.7, n3=-33;

    System.out.print("---Sayılar---\n");
    System.out.println(" "+n1);
    System.out.println(" "+n2);
    System.out.println(" "+n3);

    if(n1>=n2 && n1>=n3){
        System.out.println("En büyük sayı : "+n1);
    }
    else if(n2>=n1 && n2>=n3){
        System.out.println("En büyük sayı : "+n2);
    }
    else{
        System.out.println("En büyük sayı : "+n3);
        }
    }
}
