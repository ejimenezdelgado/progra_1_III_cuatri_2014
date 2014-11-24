/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

import Listas.ListaProductos;
import java.util.Date;

/**
 *
 * @author Jimenez
 */
public class Facturas {
    
    private int id;
    private String cliente;
    private int	totalGravado;
    private int	totalExcepto;
    private int	subtotal;
    private Date fecha;
    private int	total;
    private Productos productos;
    private boolean activo;
    private Facturas siguiente;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the totalGravado
     */
    public int getTotalGravado() {
        return totalGravado;
    }

    /**
     * @param totalGravado the totalGravado to set
     */
    public void setTotalGravado(int totalGravado) {
        this.totalGravado = totalGravado;
    }

    /**
     * @return the totalExcepto
     */
    public int getTotalExcepto() {
        return totalExcepto;
    }

    /**
     * @param totalExcepto the totalExcepto to set
     */
    public void setTotalExcepto(int totalExcepto) {
        this.totalExcepto = totalExcepto;
    }

    /**
     * @return the subtotal
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the productos
     */
    public Productos getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    /**
     * @return the siguiente
     */
    public Facturas getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Facturas siguiente) {
        this.siguiente = siguiente;
    }
    
}
