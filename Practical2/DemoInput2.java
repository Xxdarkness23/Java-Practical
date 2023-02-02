/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import javax.swing.JOptionPane;

public class DemoInput2 {
    public static void main(String[] argc) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        
        JOptionPane.showMessageDialog(null,"Your name is " + name);

    }
}
