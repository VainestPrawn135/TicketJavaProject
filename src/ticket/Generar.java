/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dave
 */
public class Generar {

    public void GenerarTicket(List<Formulario> ListaFormulario, List<Productos> ListaProductos, int FormaPago, double Efectivo, String NombreVendedor) {
        double subtotal = 0;
        int ArticulosVendidos = 0;
        Scanner sc = new Scanner(System.in);
        Date FechaActual = new Date();
        DateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat Hora = new SimpleDateFormat("HH:mm:ss");
        DecimalFormat formato = new DecimalFormat("#.00");
        
        System.out.println();
        System.out.println("****************************************");
        System.out.println("\t Restaurante La Casa");
        System.out.println("****************************************");
        System.out.println("Expedido en: Centro Histórico");
        System.out.println("Dirección: Madero #48 5to. Piso");
        System.out.println("Teléfono: 12-34-56-78-90");
        System.out.println("R.F.C: XXXXXXXXXXXX");
        System.out.println("E-mail: restaurante@lacasa.mx");
        System.out.println("****************************************");
        System.out.println("Atendió: "+NombreVendedor);
        System.out.println("Cliente: " + ListaFormulario.get(0).NombreCliente);
        System.out.println("Fecha: " + Fecha.format(FechaActual) + "\t Hora: " + Hora.format(FechaActual));
        System.out.println("****************************************");
        
        System.out.println("Cant.\tArtículo\tPrecio\tTotal");
        
        for (int c = 0; c < ListaProductos.size(); c++) {
            System.out.println(ListaProductos.get(c).Cantidad + "\t" + ListaProductos.get(c).Producto + "\t$" + formato.format(ListaProductos.get(c).Precio) + "\t$" + formato.format((ListaProductos.get(c).Cantidad * ListaProductos.get(c).Precio)));
            subtotal += ListaProductos.get(c).Cantidad * ListaProductos.get(c).Precio;
            ArticulosVendidos += ListaProductos.get(c).Cantidad;
        }
        System.out.println("****************************************");
        System.out.println("Artículos vendidos: " + ArticulosVendidos);
        System.out.println("****************************************");
        System.out.println("Subtotal: $" + formato.format(subtotal));
        System.out.println("IVA: $" +formato.format((subtotal * 0.16)));
        System.out.println("Total: $" +formato.format((subtotal + (subtotal * 0.16))));
        System.out.println("****************************************");
        if (FormaPago == 1) {
            System.out.println("Tarjeta: $" +formato.format((subtotal + (subtotal * 0.16))));
        } else if (FormaPago == 2) {
            System.out.println("Efectivo: $" + formato.format(Efectivo));
            System.out.println("Cambio: $" +formato.format((Efectivo - (subtotal + (subtotal * 0.16)))));
        }
        System.out.println();
        System.out.println("\t Gracias por su visita");
        System.out.println("****************************************");
    }
}
