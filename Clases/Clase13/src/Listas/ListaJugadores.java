/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import Nodos.NodoJugador;

/**
 *
 * @author Jimenez
 */
public class ListaJugadores {
    
    NodoJugador raiz;
   
    public void Insertar(NodoJugador jugador)
    {
        NodoJugador nuevo=new NodoJugador();
        nuevo.setNombre(jugador.getNombre());
        nuevo.setEdad(jugador.getEdad());
        nuevo.setSiguiente(null);
        if(raiz==null)
        {
            raiz=nuevo;
        }
        else
        {
            NodoJugador aux;
            aux=raiz;
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public boolean Eliminar(String nombre)
    {
        NodoJugador siguienteJugador=raiz;
        NodoJugador anterior=siguienteJugador;
        if(raiz==null)
        {
            System.out.print("La lista está vacia");
            return true;
        }
        while(siguienteJugador!=null)
        {
            if(siguienteJugador.getNombre().equals(nombre))
            {
                if(raiz==siguienteJugador)
                {
                    raiz=siguienteJugador.getSiguiente();
                    return false;
                }
                anterior.setSiguiente(siguienteJugador.getSiguiente());
                return false;
            }
            anterior=siguienteJugador;
            siguienteJugador=siguienteJugador.getSiguiente();
        }
        return true;
    }
    
    public String Impresion()
    {
        NodoJugador aux;
        aux=raiz;
        String temporal="";
        while(aux!=null)
        {
            temporal+="Nombre "+aux.getNombre()+",Edad " + aux.getEdad();
            temporal+="\n";
            aux=aux.getSiguiente();
        }
        return temporal;    
    }
}
