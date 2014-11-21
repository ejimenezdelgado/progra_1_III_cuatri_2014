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
public class ListaNumeros {
    
    NodoNumero raiz;
    NodoNumero pares;
    NodoNumero impares;
   
    public void Insertar(NodoNumero numero)
    {
        NodoNumero nuevo=new NodoNumero();
        nuevo.setNumero(numero.getNumero());
        nuevo.setSiguiente(null);
        if(raiz==null)
        {
            
            raiz=nuevo;
        }
        else
        {
            NodoNumero aux;
            aux=raiz;
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            
        }
    }
    
    public void DividirLista()
    {
        NodoNumero aux=raiz;
        while(aux!=null)
        {
            if((int) aux.getNumero()%2==0)
            {
                InsertarPar(aux);
            }
            else
            {
                InsertarImpar(aux);
            }
            aux= aux.getSiguiente();
        }
    }
    
    public void InsertarPar(NodoNumero numero)
    {
        NodoNumero nuevo=new NodoNumero();
        nuevo.setNumero(numero.getNumero());
        nuevo.setSiguiente(null);
        if(pares==null)
        {
            
            pares=nuevo;
        }
        else
        {
            NodoNumero aux;
            aux=pares;
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            
        }
    }
    
    public void InsertarImpar(NodoNumero numero)
    {
        NodoNumero nuevo=new NodoNumero();
        nuevo.setNumero(numero.getNumero());
        nuevo.setSiguiente(null);
        if(impares==null)
        {
            
            impares=nuevo;
        }
        else
        {
            NodoNumero aux;
            aux=impares;
            while(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            
        }
    }
    
    public String Imprimir()
    {
        NodoNumero aux;
        String temporal="";
        
        aux=raiz;
        while(aux!=null)
        {
            temporal+=aux.getNumero()+",";
            aux=aux.getSiguiente();
        }
        
        temporal+="\n";
        temporal+="Pares";
        
        aux=pares;
        while(aux!=null)
        {
            temporal+=aux.getNumero()+",";
            aux=aux.getSiguiente();
        }
        
        temporal+="\n";
        temporal+="Impares";
        aux=impares;
        while(aux!=null)
        {
            temporal+=aux.getNumero()+",";
            aux=aux.getSiguiente();
        }
        return temporal;
    }
    
    
    
    
}
