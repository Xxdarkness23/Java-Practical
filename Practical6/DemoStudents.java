/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

/**
 *
 * @author skyen
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class DemoStudents {
    public static void main(String[] args) {
         Student [] myStudents = new Student[6];
         int index = 0;
        
         try {
             BufferedReader br = new BufferedReader(new FileReader("students.txt"));
             String s;
             
             while(( s = br.readLine())!= null)
                System.out.println(s);
                    String [] temp = s.split(",");
                 
                 myStudents[index] = 
                         new Student(temp[0],temp[1],temp[2],Integer.parseInt(temp[3]));
                            System.out.println(myStudents[index].getStudentInfo());
                 
                 
                 
                 
                 
         }
         catch(IOException e) {
             JOptionPane.showMessageDialog(null,"Error in reading file....", "Error",JOptionPane.ERROR_MESSAGE);
         }
    }
}
