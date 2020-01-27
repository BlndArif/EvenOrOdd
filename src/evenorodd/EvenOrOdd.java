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
public class EvenOrOdd {

   
    
    public void checkEO(){

        EvenOrOdd obj=new EvenOrOdd();
        String b=JOptionPane.showInputDialog("Please Enter A Number To Check If itis Even Or Odd");
int c=Integer.parseInt(b);
if (c% 2 == 0)
JOptionPane.showMessageDialog(null,"The number is Even","Even or Odd?",JOptionPane.INFORMATION_MESSAGE);
    else
JOptionPane.showMessageDialog(null,"The number is Odd","Even or Odd?",JOptionPane.INFORMATION_MESSAGE);


  // User clicked NO.
    
    JFrame frame = new JFrame();
    String message = "Try another Number?";
    int answer = JOptionPane.showConfirmDialog(frame, message);
    while (answer == JOptionPane.YES_OPTION) {
obj.checkEO();

// User clicked YES.
}
       while (answer == JOptionPane.NO_OPTION) {
    System.exit(0);       
       }}}
    

