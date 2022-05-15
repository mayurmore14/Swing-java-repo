package com.infogalaxy.interface2;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    Scanner sc = new Scanner(System.in);
    void setStudent(){
        System.out.println("Enter the ID and Name : ");
        id = sc.nextInt();
        name = sc.next();
    }
}