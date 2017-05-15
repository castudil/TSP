/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;



/**
 *
 * @author JavierAros
 */
public class PanelDibujo extends JPanel {

    public PanelDibujo(){

        setPreferredSize( new Dimension( 600, 600 ) );
        setBackground(new java.awt.Color(255,255,255));
       
      
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //g2.drawLine(10,10,20,20);
        //g2.fillOval(10,10,5,5);
       
        
    }

   
}
