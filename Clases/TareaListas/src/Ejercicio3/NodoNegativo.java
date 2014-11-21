/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio3;

/**
 *
 * @author Jimenez
 */
public class NodoNegativo {
    private int negativo;    
    private NodoNegativo siguiente;

    public NodoNegativo() {
        negativo=0;
        siguiente=null;
    }

    /**
     * @return the negativo
     */
    public int getNegativo() {
        return negativo;
    }

    /**
     * @param negativo the negativo to set
     */
    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }

    /**
     * @return the siguiente
     */
    public NodoNegativo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoNegativo siguiente) {
        this.siguiente = siguiente;
    }
    
}
