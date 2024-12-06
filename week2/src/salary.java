/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_42
 */
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = input.nextLine();
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        System.out.print("Please insert number of working days : ");
        int numday1 = input.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numday2 = input.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = input.nextInt();
        int salary = 0,bonus = 0;
        if((21 <= age)&(age <= 30)){
            salary = (numday1 * 300)-(numday2 * 50);
        }else if((31 <= age)&(age <= 40)){
            salary = (numday1 * 500)-(numday2 * 50);
        }else if((41 <= age)&(age <= 50)){
            salary = (numday1 * 1000)-(numday2 * 25);
        }else if((51 <= age)&((age <= 60))){
            salary = (numday1 * 3000);
        }
        if((10 <= weight)&(weight <= 60)){
            bonus = salary + 5000;
        }else if((61 <= weight)&(weight <= 90)){
            bonus = salary + (5000 - ((weight-60)*10));
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Bath");
        System.out.println("Your salary and bonus is " + bonus + " Bath");
    }
}
