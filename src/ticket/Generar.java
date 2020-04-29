/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dave
 */
public class Generar {

    public void GenerarTicket(List<Formulario> ListaFormulario, List<Productos> ListaProductos, int FormaPago, double Efectivo) {
        double subtotal = 0;
        int ArticulosVendidos = 0;
        Scanner sc = new Scanner(System.in);
        Date FechaActual = new Date();
        DateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat Hora = new SimpleDateFormat("HH:mm:ss");
        System.out.println("\t\t Nombre de la empresa \t\t");
        System.out.println("Expedido en: Local Principal");
        System.out.println("Dirección: Dirección del local");
        System.out.println("Teléfono: 555-555-555");
        System.out.println("R.F.C: XXXXXXXXXXXX");
        System.out.println("E-mail: nombre@empresa.mx");
        System.out.println("*********************************************************************");
        System.out.println("Atendió: Fulano de Tal");
        System.out.println("Cliente: " + ((Formulario) ListaFormulario.get(0)).NombreCliente);
        System.out.println("Fecha: " + Fecha.format(FechaActual) + "\t Hora: " + Hora.format(FechaActual));
        System.out.println("*********************************************************************");
        int c;
        for (c = 0; c < ListaFormulario.size(); c++) {
            System.out.println(((Formulario) ListaFormulario.get(c)).NombreCliente + " " + ((Formulario) ListaFormulario.get(c)).Direccion + " " + ((Formulario) ListaFormulario.get(c)).RFC);
        }
        for (c = 0; c < ListaProductos.size(); c++) {
            System.out.println(((Productos) ListaProductos.get(c)).Cantidad + " " + ((Productos) ListaProductos.get(c)).Producto + " $" + ((Productos) ListaProductos.get(c)).Precio + " $" + (((Productos) ListaProductos.get(c)).Cantidad * ((Productos) ListaProductos.get(c)).Precio));
            subtotal += ((Productos) ListaProductos.get(c)).Cantidad * ((Productos) ListaProductos.get(c)).Precio;
            ArticulosVendidos += ((Productos) ListaProductos.get(c)).Cantidad;
        }
        System.out.println("Artículos vendidos: " + ArticulosVendidos);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + (subtotal * 0.16));
        System.out.println("Total: $" + (subtotal + subtotal * 0.16));
        if (FormaPago == 1) {
            System.out.println("Tarjeta: $" + (subtotal + subtotal * 0.16));
        } else if (FormaPago == 2) {
            System.out.println("Efectivo: $" + Efectivo);
            System.out.println("Cambio: $" + (Efectivo - subtotal + subtotal * 0.16));
        }
    }
}
