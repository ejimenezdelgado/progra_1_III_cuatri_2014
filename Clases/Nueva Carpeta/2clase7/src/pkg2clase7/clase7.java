/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase7;

import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("digite la opcion del ejercicio a evaluar");
            System.out.println("1.ejercicio 1");
            System.out.println("2.ejercicio2");
            System.out.println("3.ejercicio3");
            System.out.println("4.salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oejercicio1 = new ejercicio1();

                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("digite el s11alari del trabajador #" + (i + 1));
                        oejercicio1.AgregarSalario(teclado.nextDouble());

                    }
                    System.out.println(oejercicio1.ImprimirSueldos());
                    break;

                case 2:
                    ejercicio2 oejercicio2 = new ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("digte la altura de la persona # " + (i + 1));
                        oejercicio2.AgregarAltura(teclado.nextFloat());
                    }
                    System.out.println("el promedio es: " + oejercicio2.Promedio());
                    System.out.println(oejercicio2.contarPersonas());
                    break;

                case 3:
                    ejercicio3 oejercicio3 = new ejercicio3();
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("digite el salario del empleado de la mañana #" + (i + 1));
                        oejercicio3.AgregarSalarioManana((teclado.nextFloat()));

                    }
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("digite el salario del empleado de la tarde #" + (i + 1));
                        oejercicio3.AgregarSalarioTarde(teclado.nextFloat());
                    }
                    System.out.print("el gasto total es"+oejercicio3.ImprimirGastos());
            }
        } while (opcion < 4);

    }

}
