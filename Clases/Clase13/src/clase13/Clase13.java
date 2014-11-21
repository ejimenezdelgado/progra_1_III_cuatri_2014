/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase13;

import Listas.ListaJugadores;
import Nodos.NodoJugador;
import java.util.Scanner;

/**
 *
 * @author Jimenez
 */
public class Clase13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner oScanner=new Scanner(System.in);
        ListaJugadores  listaJugadoresLiga =new ListaJugadores();
        
        NodoJugador nodoJugador1=new NodoJugador();
        nodoJugador1.setNombre("Armando Alonso");
        nodoJugador1.setEdad(30);
        listaJugadoresLiga.Insertar(nodoJugador1);
        
        NodoJugador nodoJugador2=new NodoJugador();
        nodoJugador2.setNombre("Alvaro Sanchez");
        nodoJugador2.setEdad(30);
        listaJugadoresLiga.Insertar(nodoJugador2);
        
        NodoJugador nodoJugador3=new NodoJugador();
        nodoJugador3.setNombre("Patrick Pemberton");
        nodoJugador3.setEdad(32);
        listaJugadoresLiga.Insertar(nodoJugador3);
        
       System.out.print(listaJugadoresLiga.Impresion());
       
       listaJugadoresLiga.Eliminar("Armando Alonso");
       
       System.out.print(listaJugadoresLiga.Impresion());
        
    }
    
}