package GUI.SunAnimation;

import javax.swing.*;
import java.awt.*;


public class Paint {
  //coordinates and colors
    int x=500;
    int y=50;
    int r=0, gr=0, b=255;

   //
    public void draw(){
      //create a window
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,600);
      //create panel with circle
      DrawPanel panel = new DrawPanel();

      //add objects to the frame
      frame.getContentPane().add(panel); 
      frame.setVisible(true);

      //animate
      for(int i=0; i<145; i++){
        x=x-4;
        //update the location of circle and color
        panel.repaint();
        
        try{
          Thread.sleep(3);
          
        } catch (Exception e){
          System.out.print("Print");
        }
      }
      
    }

  //Create a Panel that draws a circle
  class DrawPanel extends JPanel{
      public void paintComponent(Graphics g){
       
        Color color = new Color(r, gr,b);
        b-=2;
        g.setColor(color);
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        
        g.setColor(new Color(b, b, gr));
        g.fillOval(x,y, 75,75);
      }
 }

  
}
