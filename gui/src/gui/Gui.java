/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Rejoice Ihuoma
 */
import javax.swing.*;
public class Gui {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String abc = JOptionPane.showInputDialog("Enter Number 1");
     int a = Integer.parseInt(abc);
     String abcd = JOptionPane.showInputDialog("Enter Number 2");
     int ad = Integer.parseInt(abcd);
    double add = a + ad;
    JOptionPane.showMessageDialog(null, add);
    }
    
}
