/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.Facturas;
import Nodos.Productos;

/**
 *
 * @author Jimenez
 */
public class ListaFacturas {

    Facturas listaFacturas;

    public Facturas AgregarProducto(Facturas factura, Productos producto) {
        Productos raiz = factura.getProductos();
        Productos nuevo;
        nuevo = new Productos();
        nuevo.setActivo(producto.getActivo());
        nuevo.setCantidad(producto.getCantidad());
        nuevo.setDescripción(producto.getDescripción());
        nuevo.setEsGravado(producto.getEsGravado());
        nuevo.setFecha(producto.getFecha());
        nuevo.setId(producto.getId());
        nuevo.setImpuesto(producto.getImpuesto());
        nuevo.setPrecioUnitario(producto.getPrecioUnitario());

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            Productos auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
        factura.setProductos(raiz);
        return factura;
    }

    public Facturas EditarProducto(Facturas factura, Productos producto, int id) {
        Productos raiz = factura.getProductos();
        Productos recorrido = raiz;
        while (raiz != null) {
            if (recorrido.getId() == id) {
                recorrido.setActivo(producto.getActivo());
                recorrido.setCantidad(producto.getCantidad());
                recorrido.setDescripción(producto.getDescripción());
                recorrido.setEsGravado(producto.getEsGravado());
                recorrido.setFecha(producto.getFecha());
                recorrido.setId(producto.getId());
                recorrido.setImpuesto(producto.getImpuesto());
                recorrido.setPrecioUnitario(producto.getPrecioUnitario());
                factura.setProductos(raiz);
                return factura;
            }
            recorrido = recorrido.getSiguiente();
        }
        return null;
    }

    public Facturas EliminsrProducto(Facturas factura, Productos producto, int id) {
        Productos raiz = factura.getProductos();
        Productos siguienteProducto = raiz;
        Productos anterior = siguienteProducto;
        while (siguienteProducto != null) {
            if (siguienteProducto.getId() == id) {
                if (raiz == siguienteProducto) {
                    raiz = siguienteProducto.getSiguiente();
                    factura.setProductos(raiz);
                    return factura;
                }
                anterior.setSiguiente(siguienteProducto.getSiguiente());
                factura.setProductos(raiz);
                return factura;
            }
            anterior = siguienteProducto;
            siguienteProducto = siguienteProducto.getSiguiente();
        }
        return null;
    }

    public void CrearFactura(Facturas factura) {
        Facturas nuevo;
        nuevo = new Facturas();
        nuevo.setActivo(factura.isActivo());
        nuevo.setCliente(factura.getCliente());
        nuevo.setFecha(factura.getFecha());
        nuevo.setId(factura.getId());
        nuevo.setProductos(factura.getProductos());
        nuevo.setSiguiente(null);
        nuevo.setSubtotal(factura.getSubtotal());
        nuevo.setTotal(factura.getTotal());
        nuevo.setTotalExcepto(factura.getTotalExcepto());
        nuevo.setTotalGravado(factura.getTotalGravado());

        if (listaFacturas == null) {
            nuevo.setSiguiente(null);
            listaFacturas = nuevo;
        } else {
            Facturas auxiliar = listaFacturas;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
}
