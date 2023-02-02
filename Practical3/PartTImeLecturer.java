/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author skyen
 */
public class PartTImeLecturer extends Lecturer{
    private double hourlyRate;
    private double monthlyHours;
    
    public PartTImeLecturer(String name, int staffID, double hourlyRate, double monthlyHours){
        super(name, staffID);
        this.hourlyRate = hourlyRate;
        this.monthlyHours = monthlyHours;
        
        
    }
    
}
