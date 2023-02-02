/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author skyen
 */
public class Trapezium {
    //declaring variables needed
       private double base, top, height;
       
   public Trapezium(double b, double t, double h){//constructor method
       base =b;
       top = t;
       height = h;
              
   }
    //method for computing area
   public double getArea(){
    return (base + top) * height/2;
}
   public double getBase(){
       return base;
   }
   public double getHeight(){
       return height;
   }
   public double getTop(){
       return top;
   }
}
