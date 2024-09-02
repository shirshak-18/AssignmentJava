package Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");;
        String name = sc.nextLine();
        System.out.print("Enter your Class : ");
        String classs = sc.nextLine();
        System.out.print("Enter Your birth year :");
        int year = sc.nextInt();
        System.out.print("Enter Your birth month :");
        int month = sc.nextInt();
        System.out.print("Enter Your birth year :");
        int date = sc.nextInt();
        LocalDate birthdate = LocalDate.of(year,month,date);
        LocalDate currDate = LocalDate.now();
        int age = Period.between(birthdate, currDate).getYears();
        System.out.println("Name : "+name);
        System.out.println("Class : "+classs);
        System.out.println("DOB : "+birthdate);
        System.out.println("Age : "+age);
        
    }
}
