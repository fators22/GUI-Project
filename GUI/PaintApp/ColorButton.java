package GUI.PaintApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class ColorButton extends JButton{
  
   //class variables
   public static Random rand=new Random();

  //instance variable
   private String name;
   private Color color;


  //Constructor
   public ColorButton(){
     this.name="Try me";
     this.color= new Color( rand.nextInt(255),rand.nextInt(255), rand.nextInt(255));
     this.setBackground(this.color);
     this.setText(this.name);
   }

   public Color getColor(){
     return this.color;
   }
  
}