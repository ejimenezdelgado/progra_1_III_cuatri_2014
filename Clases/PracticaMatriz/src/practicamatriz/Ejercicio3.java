/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz;

import java.util.Random;

/**
 *
 * @author Jimenez
 */
public class Ejercicio3 {
    
    int[][] matrixA=new int[0][0];
     
     
     public void IniciarMatriz(int filas, int columnas)
     {
         matrixA=new int[filas][columnas];
     }
     
     public void LLenar()
     {
       
         for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[0].length; j++) {
                 matrixA[i][j]=i+j;
             }
         }
     }
     
     public String ImpresionPorFila()
     {
         String temporal="";
         for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[0].length; j++) {
                 temporal+= String.valueOf(matrixA[i][j]) +"-";
             }             
             temporal+="\n";
         }
         return temporal;
     }
}
