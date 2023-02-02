/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import java.util.Scanner;


public class Q1 {
    public static void main (String[] argc){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter mst
        System.out.println("Enter MST :");
        int MST = input.nextInt();
        
        System.out.println("Enter Assignment 1 Scores: ");
        int Assign1 = input.nextInt();
        
        System.out.println("Enter Assignment 2 Scores: ");
        int Assign2 = input.nextInt();
        
        System.out.println("Enter General performance: ");
        int GP = input.nextInt();
        
        int average = (int) (MST*0.2 + Assign1*0.25 + Assign2*0.35 + GP*0.2);
        
        System.out.println("Your final score is: " + average);
        
        
        
        
        
        
        
        
        
               
    }
}
