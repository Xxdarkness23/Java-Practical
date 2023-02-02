/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author skyen
 */
public class FullTimeLecturer extends Lecturer {
    private String[] PTclass;
    private int[] classSize;
    private double salary;
    
    public FullTimeLecturer(String name, int staffID, String[] PTclass, int[] classSize, double salary){
        super(name, staffID) ;
        this.PTclass = PTclass;
        this.classSize = classSize;
        this.salary = salary;
    }
    @Override
    public double calcMonthlyPay(){
        return salary;
        
    }
    
    
}
