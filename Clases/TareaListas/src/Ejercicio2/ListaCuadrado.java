/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2;

/**
 *
 * @author Jimenez
 */
public class ListaCuadrado {
    
    NodoCuadrado raiz;
    
    public void Insertar(NodoCuadrado numero)
    {
        NodoCuadrado nuevo=new NodoCuadrado();
        nuevo.setNumero(numero.getNumero());
        nuevo.setSiguiente(null);
        if(raiz==null)
        {
            
            raiz=nuevo;
        }
        else
        {
            NodoCuadrado aux;
            aux=raiz;
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public String ImpresionCuadrado()
    {
        NodoCuadrado aux;
        aux=raiz;
        String temporal="";
        while(aux!=null)
        {
            temporal+="Elemento"+aux.getNumero()+",cuadrado" + aux.getNumero()*aux.getNumero();
            temporal+="\n";
            aux=aux.getSiguiente();
        }
        return temporal;    
    }
}
