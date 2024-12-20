/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int odd = 0,even = 0;
        while (num != -1){
            if ((num %2) == 0){
                even += 1;
            }
            else {
                odd += 1;
            }
            num = input.nextInt();
        }
        System.out.print("Odd number = " + odd + " and Even number = "+ even );
    }
}
