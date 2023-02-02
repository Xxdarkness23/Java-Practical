/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author skyen
 */
public class Q9 {
    public static void main(String[] args){
        System.out.println("-= Display contents of numberArray[] =-");
        Integer[] NumberArray = new Integer[101];
        for(int i = 0; i<NumberArray.length;i++){
            if(i % 2 == 0){
                NumberArray[i] = 2;
            }else {NumberArray[i] = 1;
        } System.out.println("numberArray[" + i + ") = " + NumberArray[i]);
    } 
    }
}