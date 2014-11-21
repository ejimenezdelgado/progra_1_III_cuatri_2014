/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

/**
 *
 * @author Jimenez
 */
public class NodoNumero {
    
    private Object  numero;
    private NodoNumero siguiente;

    public NodoNumero() {
        numero=0;
        siguiente=null;
    }

    /**
     * @return the numero
     */
    public Object getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Object numero) {
        this.numero = numero;
    }

    /**
     * @return the siguiente
     */
    public NodoNumero getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoNumero siguiente) {
        this.siguiente = siguiente;
    }
  
}
