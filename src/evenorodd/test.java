/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenorodd;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author blnda
 */
public class test {
 public static void main(String[] args) {
    test ob=new test();
     EvenOrOdd obj=new EvenOrOdd();
    
obj.checkEO();

JFrame frame = new JFrame();
    String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(frame, message);
    
if (answer == JOptionPane.YES_OPTION) {
obj.checkEO();
obj.checkEO();
obj.checkEO();
// User clicked YES.
    } else if (answer == JOptionPane.NO_OPTION) {
    System.exit(0);
}













/*Object[] options = {"Yes",
                    "No"};
int n = JOptionPane.showOptionDialog(null,
    "Do You Want to try another Number?",
    "Please inform",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[2]);// TODO code application logic here*/
    }    
}
