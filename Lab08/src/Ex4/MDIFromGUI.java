/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author computer
 */
public class MDIFromGUI {
    private JDesktopPane dp;
    private JFrame fr;
    private JInternalFrame f1, f2, f3;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, mi4, mi5;
    
    public MDIFromGUI(){
        dp = new JDesktopPane();
        f1 = new JInternalFrame("Application01");
        f2 = new JInternalFrame("Application02");
        f3 = new JInternalFrame("Application03");
        
        fr = new JFrame("SubmenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        
        ms1 = new JMenu("new");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        mi4 = new JMenuItem("Window");
        mi5 = new JMenuItem("Message");
        
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        m1.add(ms1);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        ms1.add(mi4);
        ms1.add(mi5);
        
             f1.setSize(200, 150);
        f2.setSize(200, 150);
        f3.setSize(200, 150);
        
        f1.setLocation(100, 100);
        f2.setLocation(200, 200);
        f3.setLocation(300, 300);
        
        f1.setVisible(true);
        f2.setVisible(true);
        f3.setVisible(true);
        
        dp.add(f1);
        dp.add(f2);
        dp.add(f3);
        
        fr.setJMenuBar(mb);
        fr.add(dp);
        fr.setSize(800, 600);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
