/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

public class ProductManager {

    public void saveProduct(Product pdt) {
        File f = new File("product.dat");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            :
: Missing code(s
            ) for part(i)
         :
}catch (IOExce4ption ex) {
            ex.printStackTrace();
        }
    }
}
