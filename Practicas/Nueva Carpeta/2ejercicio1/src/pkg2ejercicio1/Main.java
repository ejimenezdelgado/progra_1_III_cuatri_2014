/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ejercicio1;

/*1.	Realice lo siguiente: declarar una variable N de tipo int, una variable 
 A de tipo double y una variable C de tipo char y asigna a cada una un valor. 
 A continuación muestra por pantalla: El valor de cada variable, 
 la suma de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter
 que contiene la variable C.*/
public class Main {

    public static void main(String[] args) {
       
        int N = 5;
        double A = 6;
        char C= '9';
        System.out.println("el valor de N es " + (N));
        System.out.println("el valor de A es " + (A));
        System.out.println("el valor de C es " + (C));
        System.out.println("la suma de N+A es " + (N + A));
        System.out.println("la diferencia de A-N es " + (A - N));
        int asciiValue = ( int)C ; 
        System.out.println("el valor correspondiente a la letra C es "+ asciiValue);

    }

}
 
 
