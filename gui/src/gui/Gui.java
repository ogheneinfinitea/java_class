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
    JFrame f;
     Gui() {
         f = new JFrame();
         JOptionPane.showMessageDialog(f,"Hello, Welcont to GUI");
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Gui();
    }
    
}
