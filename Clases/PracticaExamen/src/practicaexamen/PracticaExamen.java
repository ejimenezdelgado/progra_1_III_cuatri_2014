/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaexamen;

import Listas.ListaFacturas;
import Nodos.Facturas;
import Nodos.Productos;

/**
 *
 * @author Jimenez
 */
public class PracticaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaFacturas oListaFacturas=new ListaFacturas();
        
         Facturas oFactura=new Facturas();
        oFactura.setActivo(true);
        oFactura.setCliente("Marito Mortadela");
        
        Productos oProductos=new Productos();
        oProductos.setId(1);
        oProductos.setDescripción("Escoba");
        
        oFactura=oListaFacturas.AgregarProducto(oFactura, oProductos);
        
         Productos oProductos2=new Productos();
        oProductos.setId(2);
        oProductos.setDescripción("Chocolate");
        
       oFactura=oListaFacturas.AgregarProducto(oFactura, oProductos);
        
        
        
        
        oListaFacturas.CrearFactura(oFactura);
    }
    
}
