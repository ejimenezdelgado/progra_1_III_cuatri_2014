/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2ejercicio1;

import java.util.Scanner;

/**
 * 2.	Realice lo siguiente: declarar dos variables X e Y de tipo int, dos
 * variables N y M de tipo double y asigna a cada una un valor. A continuación
 * reliza y muestra muestra por pantalla una serie de operaciones entre ellas.
 *
 */
public class ejercicio2 {

    public static void main(String[] args) {

        int X, Y;
        double M, N;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor X: ");
        X = leer.nextInt();

        System.out.println("Ingrese el valor Y: ");
        Y = leer.nextInt();

        System.out.println("Ingrese el valor M: ");
        M = leer.nextInt();

        System.out.println("Ingrese el valor N: ");
        N = leer.nextInt();

        System.out.println(X+"+"+Y+"="+(X+Y));
        System.out.println(X+"-"+Y+"="+(X-Y));
        System.out.println(X+"*"+Y+"="+(X*Y));
        System.out.println(X+"/"+Y+"="+(X/Y));
        System.out.println(X+"%"+Y+"="+(X%Y));
        System.out.println(N+"+"+M+"="+(N+M));
        System.out.println(N+"-"+M+"="+(N-M));
        System.out.println(N+"*"+M+"="+(N*M));
        System.out.println(N+"/"+M+"="+(N/M));
        System.out.println(N+"%"+M+"="+(N%M));
        System.out.println(X+"+"+N+"="+(X+N));
        System.out.println(Y+"/"+M+"="+(Y/M));
        System.out.println(Y+"%"+M+"="+(Y % M));
        System.out.println("el valor de X =" +X+" el doble es "+2*X);
        System.out.println("el valor de Y =" +Y+" el doble es "+2*Y);
        System.out.println("el valor de M ="+M+ " el doble es "+2*M);
        System.out.println("el valor de N = "+N+ " el doble es "+2*N);
        System.out.println(X+" + "+Y+" + "+N+" + "+M+" = "+(X+Y+M+N));
        System.out.println(X+" * "+Y+" * "+N+" * "+M+" = "+(X*Y*M*N));
    }
    

}
