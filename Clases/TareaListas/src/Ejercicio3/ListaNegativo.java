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
public class ListaNegativo {

    NodoNegativo raiz;

    public void Insertar(NodoNegativo numero) {
        NodoNegativo nuevo = new NodoNegativo();
        nuevo.setNegativo(numero.getNegativo());
        nuevo.setSiguiente(null);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoNegativo aux;
            aux = raiz;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void ValidarNegativo() {
        NodoNegativo aux;
        aux = raiz;
        while (aux != null) {
            if (aux.getNegativo() < 0) {
                aux.setNegativo(0);
            }
            aux = aux.getSiguiente();
        }
    }
    
    public int Tamano()
    {
        NodoNegativo aux;
        aux = raiz;
        int contador=0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }
    
    public String Imprimir()
    {
        NodoNegativo aux;
        aux = raiz;
        String resultado="";
        for (int i = 0; i < Tamano(); i++) {
            resultado+=aux.getNegativo();
            aux=aux.getSiguiente();
        }
        return resultado;
    }

}
