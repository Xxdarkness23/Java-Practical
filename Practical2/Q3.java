/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your option:");
        System.out.println("1) Metric Imperial");
        System.out.println("2) Imperial");
        System.out.println(">>");
        
        int option = input.nextInt();
        float BMI;
        
       
        
        
        if (option == 1) {
           
        }
            System.out.print("Ener your weight in kilograms: ");
              float weight = input.nextFloat();
            
            System.out.print("Enter your height in meters(e.g 1.75) :");
              float height = input.nextFloat();
              
              BMI = weight/(height*height);
              
              
        
        
           
       if (option == 2) {
           System.out.print("Enter your weight in pounds: ");
             float weightP = input.nextFloat();
             
           System.out.print("Enter your height in inches :");
             float heightP = input.nextFloat();
      
             BMI = (weightP * 703)/heightP;
             
       }
       if (BMI < 18.5) {
           System.out.print("Your BMI is " + BMI + "and you are underweight");
       }
       
       else if (BMI >= 24 && BMI >= 18.5) {
           System.out.print("Your BMI is " + BMI + "and you are normal");
    }
       else if  (BMI >= 25) {
           System.out.print("Your BMI is " + BMI + "and your are Overweight");
       }
}
}
