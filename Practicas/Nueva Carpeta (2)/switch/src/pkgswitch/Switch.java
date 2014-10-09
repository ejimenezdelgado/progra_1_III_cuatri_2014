/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Switch {

    /**
     * Ingresar un número entre 1 y 12 y reportar el mes que le corresponde
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        {

          
            do {
                System.out.println("digite dgte un numero del 1 al 12");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                System.out.println("5");
                System.out.println("6");
                System.out.println("7");
                System.out.println("8");
                System.out.println("9");
                System.out.println("10");
                System.out.println("11");
                System.out.println("12");

                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("enero");

                        break;

                    case 2:
                        System.out.println("febrero");

                        break;

                    case 4:
                        System.out.println("marzo");

                        break;

                    case 5:
                        System.out.println("abril");

                        break;

                    case 6:
                        System.out.println("mayo");

                        break;

                    case 7:
                        System.out.println("junio");

                        break;

                    case 8:
                        System.out.println("julio");

                        break;

                    case 9:
                        System.out.println("agosto");

                        break;

                    case 10:
                        System.out.println("septiembre");

                        break;

                    case 11:
                        System.out.println("noviembre");

                        break;

                    case 12:
                        System.out.println("diciembre");

                        break;

                }
            } 

