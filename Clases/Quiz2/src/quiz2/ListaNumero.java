/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz2;

/**
 *
 * @author Jimenez
 */
public class ListaNumero {
    
    private NodoNumero raiz;
    
    public void Insertar(NodoNumero elemento)
    {
        NodoNumero nuevo;
        nuevo=new NodoNumero();
        nuevo.setNumero(elemento.getNumero());
        
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            NodoNumero auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }        
    } 
    
    public String ContadorNumeros()
    {
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        
        int contador6=0;
        int contador7=0;
        int contador8=0;
        int contador9=0;
        int contador10=0;
        String retorno="";
        
        NodoNumero auxiliar=raiz;
        while (auxiliar!=null) {
            
            if(auxiliar.getNumero()==1)
            {
                contador1++;
            }
            if(auxiliar.getNumero()==2)
            {
                contador2++;
            }
            if(auxiliar.getNumero()==3)
            {
                contador3++;
            }
            if(auxiliar.getNumero()==4)
            {
                contador4++;
            }
            if(auxiliar.getNumero()==5)
            {
                contador5++;
            }if(auxiliar.getNumero()==6)
            {
                contador6++;
            }if(auxiliar.getNumero()==7)
            {
                contador7++;
            }if(auxiliar.getNumero()==8)
            {
                contador8++;
            }if(auxiliar.getNumero()==9)
            {
                contador9++;
            }if(auxiliar.getNumero()==10)
            {
                contador10++;
            }
            auxiliar=auxiliar.getSiguiente();
        }
        
        retorno+=contador1 +" repeticiones de 1 ";
        retorno+=contador2 +" repeticiones de 2 ";
        retorno+=contador3 +" repeticiones de 3 ";
        retorno+=contador4 +" repeticiones de 4 ";
        retorno+=contador5 +" repeticiones de 5 ";
        retorno+=contador6 +" repeticiones de 6 ";
        retorno+=contador7 +" repeticiones de 7 ";
        retorno+=contador8 +" repeticiones de 8 ";
        retorno+=contador9 +" repeticiones de 9 ";
        retorno+=contador10 +" repeticiones de 10 ";
        
        return retorno;
    }
    
}
