/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase3;

/**
 *
 * @author Jimenez
 */
public class Ejercicio1 {
    
    /*Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 
    hasta el valor ingresado de uno en uno.
    Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.*/
    
    private String numeros="";
    
    public Ejercicio1(int numero)
    {
        this.ImprimirNumeros(numero);
    }
    
    private String ImprimirNumeros(int numero)
    {        
        for (int i = 0; i < numero; i++) {
            numeros+= i+"";
        }
        return getNumeros();
    }

    /**
     * @return the numeros
     */
    public String getNumeros() {
        return numeros;
    }
    
}
