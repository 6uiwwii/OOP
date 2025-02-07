/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author computer
 */
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2 ;
    private JTextField txt1, txt2;
    private JButton btn1, btn2, btn3 ;
    private JLabel lb1, lb2;
    
    public TellerGUI(){
        fr  = new JFrame("Tell GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField("6000");
        txt2 = new JTextField();
        btn1 = new JButton("Deposite");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        lb1 = new JLabel(" Balance");
        lb2 = new JLabel(" Amount");
        
        fr.setLayout(new GridLayout(2,1));
            p1.setLayout(new GridLayout(2,2));
                txt1.setEditable(false);
                p1.add(lb1); p1.add(txt1);
                p1.add(lb2); p1.add(txt2);
        fr.add(p1);
            p2.setLayout(new FlowLayout());
                p2.add(btn1);
                p2.add(btn2);
                p2.add(btn3);
        fr.add(p2);
                
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }    
        
}
