package com.infogalaxy.computerdept;
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void setStudent()
    {
        System.out.println("Enter the ID and Name :");
        id = sc.nextInt();
        name = sc.next();
    }
}
class Result extends Student {
    int perc;
    void setPerc() {
        System.out.println("Enter the Percentage : ");
        perc = sc.nextInt();
    }
    void getResult() {
        System.out.println("ID : "+id);
        System.out.println("Name :"+name);
        System.out.println("Percentage :"+perc);
    }
}
class Main
{
    public static void main(String[] args) {
        Result result = new Result();
        result.setStudent();
        result.setPerc();
        result.getResult();
    }
}