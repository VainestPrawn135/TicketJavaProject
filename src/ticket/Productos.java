/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author Dave
 */
public class Productos {

    public int Cantidad;
    public String Producto;
    public double Precio;

    public Productos(int _Cantidad, String _Producto, double _Precio) {
        this.Cantidad = _Cantidad;
        this.Producto = _Producto;
        this.Precio = _Precio;
    }
}
