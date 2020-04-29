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
public class Formulario {

    public String NombreCliente;
    public String Telefono;
    public String Direccion;
    public String RFC;

    public Formulario(String _NombreCliente, String _Telefono, String _Direccion, String _RFC) {
        this.NombreCliente = _NombreCliente;
        this.Telefono = _Telefono;
        this.Direccion = _Direccion;
        this.RFC = _RFC;
    }
}
