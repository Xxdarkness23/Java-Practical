/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author skyen
 */
public class Circle {
    private double radius;
    public static void printArray(String[] args) {
           // Declare and acreate an array to store 3 circle objects
    Circle [] circles = new Circle[3];
    
        for (Circle circle : circles) {
            System.out.println(circle.getArea());
        }
    }
    public Circle(double r) {
        radius = r;
    }
    
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    //write a method that returns the value of radius
    public double getRadius() {
        return radius;
    }
    
    //method to which the user can update the values
//    public void radius(){
//        double r;
//        radius = r;
//    }
    
    // Declare and acreate an array to store 3 circle objects
    Circle [] circles = new Circle[3];
    
    //create circle objects and store in the array, with radius to be 10, 20 and 30
//    for(int i = 0; i<circles.length;i++) {
//    System.out.println(circles[i].getArea());
//    }
}

