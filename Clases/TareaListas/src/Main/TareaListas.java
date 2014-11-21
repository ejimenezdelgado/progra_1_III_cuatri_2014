package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Random;
import java.util.Scanner;
import Ejercicio2.ListaCuadrado;
import Ejercicio2.NodoCuadrado;
import Ejercicio3.ListaNegativo;
import Ejercicio3.NodoNegativo;

/**
 *
 * @author Jimenez
 */
public class TareaListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner=new Scanner(System.in);
       /* ListaNumeros oListaNumeros=new ListaNumeros();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite el numero " + (i+1));
            NodoNumero numero=new NodoNumero();
            numero.setNumero(scanner.nextInt());
            oListaNumeros.Insertar(numero);
        }
        oListaNumeros.DividirLista();        
        System.out.print(oListaNumeros.Imprimir());*/
        
        
        ListaCuadrado cuadrado=new ListaCuadrado();
        
        Random random=new Random();
        
        int numero=random.nextInt(10)*100;
        
        /*for (int i = 0; i < numero; i++) {
            NodoCuadrado nodoCuadrado=new NodoCuadrado();
            nodoCuadrado.setNumero(random.nextInt(10)*20);
            cuadrado.Insertar(nodoCuadrado);
        }
        System.out.println(cuadrado.ImpresionCuadrado());*/
        
        ListaNegativo listaNegativo=new ListaNegativo();
        for (int i = 0; i < numero; i++) {
            NodoNegativo negativo=new NodoNegativo();
            negativo.setNegativo(random.nextInt(10)*-20);
            listaNegativo.Insertar(negativo);
        }
        listaNegativo.ValidarNegativo();
        System.out.println(listaNegativo.Imprimir());
        
    }
    
}
