/* 
 * Sofia Covarrubias, 01/28/2020, Swing App
 * This is a duck slide show featuring cool ducks.
 */

// ----- import statements -----
import javax.swing.*;
import java.awt.event.*; // allows use of events
import java.awt.*;
import java.util.ArrayList; // allows use of ArrayList

class Main
{
  public static void main (String[] args)
  {
    // ----- Declarations -----
    ArrayList<String> duckImages = new ArrayList<String>(); // image file names
    duckImages.add("duck1.jpg");
    duckImages.add("duck2.jpg");
    duckImages.add("duck3.jpg");
    duckImages.add("duck4.jpg");
    duckImages.add("duck5.jpg");
    String[] duckNames = {"Goth Girl", "Punk Rocker", "Cool Dude", "Scuba Diver", "Studious Scholar"}; // image label names

    // ----- Frame -----
    JFrame frame = new JFrame("Sofia's Duck Slideshow");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // YOU MUST HAVE THIS LINE
    frame.setSize(500, 500);
    frame.setVisible(true);

    // ----- Panel 1 -----
    JPanel panel1 = new JPanel(new GridLayout(2, 2, 20, 20));

    // ----- Image Label -----
    JLabel imgLabel = new JLabel("  Duck #1's Name: ");

    // ----- Image Text Field -----
    JTextField imgTextField = new JTextField(10);

    // ----- "Next" Button ----- 
    JButton nextButton = new JButton("Next →");

    nextButton.addActionListener(new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
          
        } //end actionPerformed
    }); //end ActionListener

    // ----- "Previous" Button ----- 
    JButton prevButton = new JButton("← Previous");

    prevButton.addActionListener(new ActionListener()
    {
        public void actionPerformed (ActionEvent e)
        {
          
        } //end actionPerformed
    }); //end ActionListener

    // ----- Adding to Panel 1 -----
    panel1.add(prevButton);
    panel1.add(nextButton);
    panel1.add(imgLabel);
    panel1.add(imgTextField);

    // ----- Panel 2 -----
    JPanel panel2 = new JPanel(new BorderLayout(10, 10));
    
    // ----- Adding to Panel 2 -----

    // ----- Adding to Frame -----
    frame.getContentPane().add(BorderLayout.NORTH, panel1);
    frame.getContentPane().add(BorderLayout.CENTER, panel2);

  } // end main method
} // end Main class