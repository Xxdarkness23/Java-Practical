
package Practical2;

import javax.swing.JOptionPane;

public class DemoLoop {
    public static void main(String[] args) {
        int num;
        do{
            String input = JOptionPane.showInputDialog(null, "Enter your age :");
             num = Integer.parseInt(input);
            if(num < 1)
                JOptionPane.showMessageDialog(null,"Pls enter a number greater than 0! \n\n ", "Error",
                         JOptionPane.ERROR_MESSAGE);
        }while(num <1);
    }
    
}
