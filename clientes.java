/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class clientes {
    public String nombre;
    public String cedula;
    public String codigoFactura;
    public double montoFactura;
    public int productosElectricos;
    public int productosAutomotrices;
    public int productosConstruccion;
    
    public clientes(){
        this.nombre="";
        this.cedula="";
        this.codigoFactura="";
        this.montoFactura=0;
        this.productosElectricos=0;
        this.productosAutomotrices=0;
        this.productosConstruccion=0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =  nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(int productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public int getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(int productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public int getProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(int productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }
    
   
      
    }
    

