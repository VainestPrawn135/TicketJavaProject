/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dave
 */
public class Captura {

    public Captura() {
        System.out.println(" -- Capture los productos -- ");
    }

    public void CapturaProductos() {
        String Ingresa = "no", NombreVendedor = " ";
        double Efectivo = 0, subtotal = 0;
        Scanner sc = new Scanner(System.in);
        List<Productos> ListaProductos = new ArrayList<Productos>();
        List<Formulario> DatosCliente = new ArrayList<Formulario>();

        System.out.print("Ingrese su nombre: " + NombreVendedor);
        NombreVendedor = sc.nextLine();

        while ("no".equals(Ingresa)) {
            System.out.print("Ingrese producto: ");
            String Producto = sc.nextLine();
            System.out.print("Ingresa cantidad: ");
            int Cantidad = sc.nextInt();
            System.out.print("Ingrese precio: $");
            double Precio = sc.nextDouble();
            sc.nextLine();
            ListaProductos.add(new Productos(Cantidad, Producto, Precio));
            System.out.print("Desea levantar el pedido? (Si/No): ");
            Ingresa = sc.nextLine().toLowerCase();
        }
        if ("si".equals(Ingresa)) {
            System.out.println("Formulario para datos del cliente");
            System.out.print("Ingrese nombre completo del cliente: ");
            String Nombre = sc.nextLine();
            System.out.print("Ingrese telefono fijo/celular: ");
            String Telefono = sc.nextLine();
            System.out.print("Ingrese dirección: ");
            String Direccion = sc.nextLine();
            System.out.print("Ingrese RFC: ");
            String RFC = sc.nextLine();

            for (int c = 0; c < ListaProductos.size(); c++) {
                subtotal += ListaProductos.get(c).Cantidad * ListaProductos.get(c).Precio;
            }
            
            System.out.println("Total: $" +(subtotal + (subtotal * 0.16)));
            System.out.print("Modo de pago: 1.- Tarjeta/2.-Efectivo: ");
            int FormaPago = sc.nextInt();
            if (FormaPago == 2) {
                System.out.print("Capture Efectivo: $");
                Efectivo = sc.nextDouble();
            }
            DatosCliente.add(new Formulario(Nombre, Telefono, Direccion, RFC));
            Generar imprime = new Generar();
            imprime.GenerarTicket(DatosCliente, ListaProductos, FormaPago, Efectivo, NombreVendedor);
        }
        DatosCliente.clear();
        ListaProductos.clear();
    }
}
