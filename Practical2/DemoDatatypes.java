
package Practical2;



public class DemoDatatypes {
    public static void main(String[] argc) {
        //Declare and Create Scanner object
        
        Scanner input = new Scanner (System.in);
        
        //read user-input
        
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
    }
        
