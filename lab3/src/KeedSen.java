/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_54
 */
import java.util.Scanner;
public class KeedSen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = input.nextInt();
            for (int i =1; i <=num;i++){
                    if ((i%5) != 0){
                        System.out.print("|");
                    }
                    else if((i%5) == 0){
                        System.out.print("/");
                    }
            }
        }
    }

