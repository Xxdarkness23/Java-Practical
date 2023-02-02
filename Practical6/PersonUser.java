
package Practical6;

import java.io.*;
import javax.swing.JOptionPane;


public class PersonUser {
        
        public void saveObject() {
            File f = new File("Person.dat");
            Person p = new Person("John ", 35, 5999.9);
            
            
            try {
            ObjectOutputStream outStream = new ObjectOutputStream(
            new FileOutputStream(f));
            
            outStream.writeObject(p);
            
            outStream.close(); //Important line never forget to close after every usage of outStream.
            
        } catch(IOException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // use this instead of JOptionPane
        }
            
        }
        
     
        
        public void readObject() {
            File f = new File("Person.dat");
                        
            try {
            ObjectInputStream inStream = new ObjectInputStream(
                new FileInputStream(f));
            
            
            Person inP = (Person)inStream.readObject();
                System.out.println("Name " + inP.getName());
                System.out.println("Age: " + inP.getAge());
                System.out.println("Salary: " + inP.getSalary());

            
        
            
            inStream.close(); //Important line never forget to close after every usage of outStream.
            
        } catch(IOException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // use this instead of JOptionPane
            }
            catch(ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
            
            
          public static void main(String[] args) {
        PersonUser pu = new PersonUser();
        pu.readObject();
    }
      
}
