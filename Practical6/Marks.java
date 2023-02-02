/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

/**
 *
 * @author skyen
 */
import java.io.*;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
public class Marks {
 
    public static void saveMarks() {
        try {
            PrintWriter pw = new PrintWriter(
            newFileWriter("marks.txt"));
            
            for(int i =0;i<10;i++) {
                String input = JOptionPane.showInputDialog(null,"Enter marks for student" + (i+1) + ":");
                
                pw.println
            }
        }
    }
    
    public static double ReadMarks() {
        double avg =0;
        double total =0;
        int count =0;
        String marksStr;
        try {
            BufferedReader br = new BufferedReader(
            new FileReader("marls.txt"));
            
            while((marksStr = br.readLine()!=null){
                total += Double.parseDouble(marksStr);
                count++;
                
            }
    br.close();
    avg= total /count;
        } catch(IOException e) {
            
        }
        
    }return avg;
    
}
