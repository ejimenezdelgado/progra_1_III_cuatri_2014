/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jimenez
 */
public class Ejercicio3 {
    
    
    private int[][] matriz;
    
    public void CrearMatriz(int fila,int columnas)
    {
        matriz=new int[fila][columnas];
    }
    
    public void CargarMatriz()
    {
        Scanner teclado =new Scanner(System.in);
        for (int j = 0; j < matriz[0].length; j++) {            
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j]=teclado.nextInt();
            }                
        } 
    }
    
    public String Imprimir()
    {
        String impresion="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                impresion +=matriz[i][j] +" ";
            }
            impresion +="\n";
        }
        return impresion;
    }
}
