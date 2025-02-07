/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author computer
 */
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JTextField txt;
    private JButton btn1, btn2, btn3, btn4 ,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p1 = new JPanel ();
        p2 = new JPanel ();
        p3 = new JPanel ();
        p4 = new JPanel ();
        txt = new JTextField();
        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn3 = new JButton("9");
        btn4 = new JButton("+");
        btn5 = new JButton("4");
        btn6 = new JButton("5");
        btn7 = new JButton("6");
        btn8 = new JButton("-");
        btn9 = new JButton("1");
        btn10 = new JButton("2");
        btn11 = new JButton("3");
        btn12 = new JButton("x");
        btn13 = new JButton("0");
        btn14 = new JButton("c");
        btn15 = new JButton("=");
        btn16 = new JButton("÷");
        
        fr.setLayout(new GridLayout(5,1));
            fr.add(txt);
        
            p1.setLayout(new GridLayout(1,4));
                p1.add(btn1); p1.add(btn2); p1.add(btn3); p1.add(btn4);
        fr.add(p1);
        
            p2.setLayout(new GridLayout(1,4));
                p2.add(btn5); p2.add(btn6); p2.add(btn7); p2.add(btn8);
                fr.add(p2);
        
            p3.setLayout(new GridLayout(1,4));
                p3.add(btn9); p3.add(btn10); p3.add(btn11); p3.add(btn12);
        fr.add(p3);
        
            p4.setLayout(new GridLayout(1,4));
                p4.add(btn13); p4.add(btn14); p4.add(btn15); p4.add(btn16);
        fr.add(p4);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
