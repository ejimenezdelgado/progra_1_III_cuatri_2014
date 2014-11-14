/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase12;

/**
 *
 * @author Jimenez
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NodoDeLista nodoDelista1=new NodoDeLista();
        nodoDelista1.setMatricula("01");
        nodoDelista1.setDueno("Efren Jimenez");
        nodoDelista1.setMarca("Toyota");
        
        NodoDeLista nodoDelista2=new NodoDeLista();
        nodoDelista2.setMatricula("02");
        nodoDelista2.setDueno("Marito Mortadela");
        nodoDelista2.setMarca("Vaca");
        
        Lista oLista=new Lista();
        oLista.Insertar(nodoDelista1);
        oLista.Insertar(nodoDelista2);
        oLista.Imprimir();
    }
    
}
