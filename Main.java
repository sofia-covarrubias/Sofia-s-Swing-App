/* 
 * Sofia Covarrubias, 01/28/2020, Swing App
 * This is a duck slide show featuring cool ducks.
 */

// ----- import statements -----
import javax.swing.*;
import java.awt.event.*; //this enables the events
import java.awt.*;

class Main
{
  public static void main (String[] args)
  {
    // ----- Frame -----
    JFrame frame = new JFrame("Sofia's Duck Slideshow");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // YOU MUST HAVE THIS LINE
    frame.setSize(500, 500);
    frame.setVisible(true);

    // ----- Panel 1 -----
    JPanel panel1 = new JPanel(new GridLayout(2, 2, 20, 20));

    // ----- Image Label -----
    JLabel imgLabel = new JLabel("Testing");

    // ----- Image Text Field -----
    JTextField imgTextField = new JTextField(10);

    // ----- Adding to Panel 1 -----
    panel1.add(imgLabel);
    panel1.add(imgTextField);

    // ----- Panel 2 -----
    JPanel panel2 = new JPanel(new BorderLayout(10, 10));

    // ----- "Next" Button ----- 

    // ----- "Previous" Button -----

    // ----- Adding to Panel 2 -----

    // ----- Adding to Frame -----
    frame.getContentPane().add(BorderLayout.NORTH, panel1);
    frame.getContentPane().add(BorderLayout.CENTER, panel2);

  } // end main method
} // end Main class