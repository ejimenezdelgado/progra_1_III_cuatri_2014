/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.Scanner;

/**
 *
 * @author Jimenez
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner=new Scanner(System.in);
       // Ejercicio1 oEjercico1=new Ejercicio1();
        //System.out.println(oEjercico1.Alrevez(oScanner.nextLine()));
        
       // Ejercicio2 oEjercicio2=new Ejercicio2();
        //oScanner=new Scanner(System.in);
       // System.out.println(oEjercicio2.Impresion(oScanner.nextLine()));
        
       // Ejercicio3 oEjercicio3=new Ejercicio3();
       // oScanner=new Scanner(System.in);
        //System.out.println(oEjercicio3.EliminarEspacios(oScanner.nextLine()));
        
         Ejercicio4 oEjercicio4=new Ejercicio4();
        oScanner=new Scanner(System.in);
        System.out.println(oEjercicio4.Numeros(oScanner.nextLine()));
        
    }
    
}
