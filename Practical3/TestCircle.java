package Practical3;





/**
 *
 * @author skyen
 */
public class TestCircle {
    public static void main(String[] args) {
        //step 1 create the object
        Circle c1;
        Circle c2;
        
        //step 2 make a new method
        c1= new Circle(2.7);
      
        //step 3 call the method and print the area of the c1
        double a = c1.getArea();
        System.out.println("c1 area = " + a);
        System.out.println("cl radius =" + c1.getRadius());
        
        //step 4 declare and create c2 Circle object and print the area of c2
        c2 = new Circle(2.7);
        
        double b = c2.getArea();
        System.out.println("c2 area = " + b);
        System.out.println("c2 radius = " + c2.getRadius());
       
    }
}