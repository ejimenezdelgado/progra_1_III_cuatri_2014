/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaexamen;

import Listas.ListaFacturas;
import Nodos.Facturas;
import Nodos.Productos;
import java.util.Date;
import java.util.Scanner;

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
        Scanner oScanner=new Scanner(System.in);
        
        ListaFacturas oListaFacturas=new ListaFacturas();
        
         Facturas oFactura=new Facturas();
         oFactura.setId(1);
        oFactura.setActivo(true);
        System.out.println("Digite el nombre del cliente");
        oFactura.setFecha(new Date());
        
        oFactura.setCliente(oScanner.nextLine());
        
        Productos oProductos=new Productos();
        oProductos.setId(1);
        oProductos.setDescripción("Escoba");
        oProductos.setEsGravado(true);
        oProductos.setImpuesto(13);
        oProductos.setPrecioUnitario(100);
        oProductos.setCantidad(2);
        
        
        oFactura=oListaFacturas.AgregarProducto(oFactura, oProductos);
        
         Productos oProductos2=new Productos();
        oProductos.setId(2);
        oProductos.setDescripción("Chocolate");
        oProductos.setEsGravado(false);
        oProductos.setImpuesto(13);
        oProductos.setPrecioUnitario(50);
        oProductos.setCantidad(1);
        
       oFactura=oListaFacturas.AgregarProducto(oFactura, oProductos);
        
        
        
        
        oListaFacturas.CrearFactura(oFactura);
        
        oListaFacturas.Impresion(oFactura);
        
        System.out.println("Digite el id de la factura a buscar");
        oScanner=new Scanner(System.in);
        oListaFacturas.Reemprimir(oScanner.nextInt());
    }
    
}
