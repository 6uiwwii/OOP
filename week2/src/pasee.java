/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_42
 */
import java.util.*;
public class pasee {
    public static void main(String[] args) {
        double money, pasee;
        Scanner input = new Scanner(System.in);
        money = input.nextDouble();
        if(money > 50000){
            pasee = (10.0/100.0)* money;
            System.out.println(pasee);
        }else if(money <= 50000){
            pasee = (5.0/100.0)*money;
            System.out.println(pasee);
        }
        
    }
}
