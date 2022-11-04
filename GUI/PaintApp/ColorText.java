package GUI.PaintApp;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ColorText{
  //create a JFrame Objects 
   private ColorButton button1, button2, button3, button4;
   private JLabel label1, label2, label3, label4;

   public ColorText(){     
    
    JFrame frame = new JFrame("Coloring App");
    frame.setSize(500, 500);
    frame.setLayout(new GridLayout(2,1));
     //create panel for labels 
    JPanel labelPanel = new JPanel();
    labelPanel.setLayout(new GridLayout(4,1));
    //create each label with given prompts
    label1 = new JLabel("The is going to  ");
    label2 = new JLabel("be a November to  ");
    label3 = new JLabel("Remember ");
    label4 = new JLabel("Charmaine J. Forde ");
    //add each label to panel for labels
     labelPanel.add(label1);
     labelPanel.add(label2);
     labelPanel.add(label3);
     labelPanel.add(label4);
     
     //create panel for buttons
    JPanel buttonPanel = new JPanel();
     buttonPanel.setLayout(new GridLayout(2,2));
    //create each button
    button1= new ColorButton();
    button2= new ColorButton();
    button3= new ColorButton();
    button4= new ColorButton();
     
    //add each button to panel for buttons
    
     buttonPanel.add(button1);
     buttonPanel.add(button2);
     buttonPanel.add(button3);
     buttonPanel.add(button4);
    
     //create actionListener for each button  and call changeText(ColorButton b) 
     button1.addActionListener(e->changeText(button1) );
     button2.addActionListener(e->changeText(button2) );
     button3.addActionListener(e->changeText(button3) );
     button4.addActionListener(e->changeText(button4) );
    
    //add  panel for label to current window
    frame.add(labelPanel);
    //add panel for button to current window
    frame.add(buttonPanel);
    //show the window
    frame.setVisible(true);

  }
  public void changeText( ColorButton b){
       //set font color to  button color 
       label1.setForeground(b.getColor());
       label2.setForeground(b.getColor());
       label3.setForeground(b.getColor());
       label4.setForeground(b.getColor());
         
   } 
  }
  

         