/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

import java.io.Serializable;

/**
 *
 * @author skyen
 */
public class Product implements Serializable {
    private String code;
    private double price;
    
    public Product(String s, double p) {
        code =s;
        price = p;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }
    
}
