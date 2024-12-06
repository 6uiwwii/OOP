/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_42
 */
import java.util.Scanner;

public class tanakan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your money : ");
        int money = input.nextInt();
        System.out.print("Enter your account type (Please type A B C or X in uppercase) : ");
        char type = input.next().charAt(0);
        double total = 0;
        if ((type == 'A') | (type == 'C')) {
            total = ((1.5 / 100) * money) + money;
        } else if (type == 'B') {
            total = ((2.0 / 100) * money) + money;
        } else if (type == 'X') {
            total = ((5.0 / 100) * money) + money;
        }
        System.out.print("Your total money in one year = ");
        System.out.println(Math.round(total));
    }
}
