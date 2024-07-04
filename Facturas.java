/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Facturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        clientes micliente = new clientes();
    
        int cantidadFacturas;
        
        cantidadFacturas =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas que desea agregar: "));
        
       
       
        for(int i=0;i<cantidadFacturas;i++)
        {
        
        String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente");
        String cedula = JOptionPane.showInputDialog("Digite el numero de cedula:");
        String codigoFactura = JOptionPane.showInputDialog("Digite el codigo de la factura:");
        double montoFactura = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el monto de la factura"));
        int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos electricos: "));
        int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices: "));
        int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos construccion: "));
        
       
        double acumuladorFacturas=0;
        int acumuladorProductosE=0;
        int acumuladorProductosA=0;
        int acumuladorProductosC=0;
        
        
        micliente.setNombre(nombre);
           
        micliente.setCedula(cedula);
            
        micliente.setCodigoFactura(codigoFactura);
           
        micliente.setMontoFactura(montoFactura);
            
        micliente.setProductosElectricos(productosElectricos);
            
        micliente.setProductosAutomotrices(productosAutomotrices);
        
        micliente.setProductosConstruccion(productosConstruccion);
        
        acumuladorFacturas = acumuladorFacturas+montoFactura;
        acumuladorProductosE = acumuladorProductosE+productosElectricos;
        acumuladorProductosA = acumuladorProductosA+productosAutomotrices;
        acumuladorProductosC = acumuladorProductosC+productosConstruccion;
        
        }
        
        
        
        }
           
}
