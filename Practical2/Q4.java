/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

import javax.swing.JOptionPane;

public class Q4 {

    public static void main(String[] args) {
        // prompt user to enter the number
        Integer num;
        String convert;
        do {
            num = Integer.valueOf(JOptionPane.showInputDialog("Enter a numeric value:"));
            if (num < 0 || num > 10) {
                JOptionPane.showMessageDialog(null, "Please enter a number between 1-10!", "Error!", JOptionPane.ERROR_MESSAGE);
            }

            convert = "";
            switch (num) {
                case 1:
                    convert = "I";
                    break;
                case 2:
                    convert = "II";
                    break;
                case 3:
                    convert = "III";
                    break;
                case 4:
                    convert = "IV";
                    break;
                case 5:
                    convert = "V";
                    break;
                case 6:
                    convert = "VI";
                    break;
                case 7:
                    convert = "VII";
                    break;
                case 8:
                    convert = "VIII";
                    break;
                case 9:
                    convert = "IX";
                    break;
                case 10:
                    convert = "X";
                    break;

            }
        } while (num < 0 || num > 10);
        JOptionPane.showMessageDialog(null, "Roman numeral value = " + convert);
    }

}
