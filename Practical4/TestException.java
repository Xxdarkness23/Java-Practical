/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical4;

/**
 *
 * @author skyen
 */

import java.util.Scanner;
        
public class TestException {
    
    public static void main(String[] args) {
aMethod();
}
public static void aMethod() {
Scanner br = new Scanner(System.in);
int [] numbers = {10, 20, 30};
System.out.print("Enter 1st Number : ");
int a = Integer.parseInt(br.next());
System.out.println("1");
System.out.print("Enter 2nd Number: ");
int b = Integer.parseInt(br.next());
System.out.println("2");
int c = a/b;
System.out.println("3");
System.out.println("c = "+ c);
System.out.println(numbers[a]);
}
}
}
