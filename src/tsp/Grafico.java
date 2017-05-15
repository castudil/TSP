/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;

/**
 *
 * @author JavierAros
 */
public class Grafico extends javax.swing.JFrame {
    
    private javax.swing.JButton jButtonGenerarPermutacion;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCosto;
    private PanelDibujo jPanel1;
    
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public Grafico(){
     initUI();
    }

    private void initUI() {
        setResizable(false);
        jPanel1 = new PanelDibujo(); //existen 5 elementos en el mockup, aqui creamos las variables asociadas a cada uno de esos elementos
        jLabel1 = new javax.swing.JLabel();
        jButtonGenerarPermutacion = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jLabelCosto = new javax.swing.JLabel(); //constructor para JLabel (Etiqueta)

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //como se cierra el sistema
        setTitle("TSP");
        setMinimumSize(new java.awt.Dimension(WIDTH, HEIGHT));
        setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Costo de la solución:");

        jButtonGenerarPermutacion.setText("Generar permutacion");
        jButtonGenerarPermutacion.setToolTipText(""); // mensaje de informacion cuando uno coloca el mouse encima
        jButtonGenerarPermutacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); //tipo de dibujo del cursor
        jButtonGenerarPermutacion.addActionListener(new java.awt.event.ActionListener() { // el boton va  a ser clickeable
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarPermutacionActionPerformed(evt);
            }
        });

        jButtonCargar.setText("Cargar archivo"); //boton para cargar el archivo
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jLabelCosto.setText("0");//costo que aparece al principio

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout); //todos estos codigos se encargan de la disposiocion de los elementos en el panel
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCargar))// estamos agregan el boton cargas
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)) //agregar la etiqueta del costos
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButtonGenerarPermutacion))//agregar otro boton
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonCargar)
                .addGap(18, 18, 18)
                .addComponent(jButtonGenerarPermutacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCosto)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();      
    }        

    private void jButtonGenerarPermutacionActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }                                        

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }  
        
        

    }

