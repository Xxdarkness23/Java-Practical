/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import javax.swing.JOptionPane;

public class Q2 {
    public static void main (String[] argc){
        
        String input = JOptionPane.showInputDialog(null,"Enter PH level of the tested water : ");
        
        double ph = Double.parseDouble(input);
        
        
        //what is displayed after user's input
        String strHealth;
        
        if (ph < 7.0) {
            strHealth = "acidic";
            
        } else if (ph == 7.0) {
            strHealth = "neutral";
        } else {
            strHealth = "alkaline";
        }
        JOptionPane.showMessageDialog(null, "Your aquarium water is " + strHealth);
       
    }
    
}
