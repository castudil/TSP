/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.io.File;
import java.util.ArrayList;



/**
 *
 * @author JavierAros, Cesar Astudillo
 * Esta clase esta imcompleta. Usted debe agregar toda la funcionalidad.
 * Esta clase se encargar de cargar el archivo que se pasa como parametros (ver linea #31).
 * cada uno de los atributos, pertenece a una variable del archivo http://elib.zib.de/pub/mp-testdata/tsp/tsplib/tsp/bays29.tsp
 * Usted debe leer el archivo y almacenar la informacion.
 * para leer una secuencia de datos de una matriz en un archivo, recomiendo utilizar la clase StringTokenizer.
 * su tarea sera investigar, como funciona esta clase y leer la matriz desde el archivo.
 */
public class FileTSP {
    private String name;
    private String type;
    private String comment;
    private String dimension;
    private String edgeWeightType;
    private String edgeWeightFormat;
    private String displayDataType;
    private int[][] edgEweighTsection;
    private ArrayList<Nodo> displayDataSelection;
   
    public FileTSP(File archivo){
        //sugerencia StringTokenizer
    }
}
