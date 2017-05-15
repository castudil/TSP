/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.awt.Point;

/**
 *
 * @author JavierAros
 */

public class Nodo {
    private Point posicion;
    private int id;
    public Nodo(int id, int x, int y){
        this.posicion = new Point(x, y);
        this.id = id;          
    }

    public Point getPosicion() {
        return posicion;
    }

    public int getId() {
        return id;
    }
    
    
}
