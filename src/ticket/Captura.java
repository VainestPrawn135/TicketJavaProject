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
        String Ingresa = "no";
        double Efectivo = 0.0D;
        Scanner sc = new Scanner(System.in);
        List<Productos> ListaProductos = new ArrayList<Productos>();
        List<Formulario> DatosCliente = new ArrayList<Formulario>();
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
            System.out.print("1.- Tarjeta/2.-Efectivo: ");
            int FormaPago = sc.nextInt();
            if (FormaPago == 2) {
                System.out.print("Capture Efectivo: $");
                Efectivo = sc.nextDouble();
            }
            DatosCliente.add(new Formulario(Nombre, Telefono, Direccion, RFC));
            Generar imprime = new Generar();
            imprime.GenerarTicket(DatosCliente, ListaProductos, FormaPago, Efectivo);
        }
        DatosCliente.clear();
        ListaProductos.clear();
    }
}
