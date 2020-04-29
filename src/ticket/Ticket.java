/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.Scanner;

/**
 *
 * @author Dave
 */
public class Ticket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            Captura ticket;
            System.out.println(" --- Este programa genera tickets de un restaurante --- ");
            System.out.println(" 1.-Capturar productos ");
            System.out.println(" 2.-Salir ");
            System.out.print(" Teclee una opción: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    ticket = new Captura();
                    ticket.CapturaProductos();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, opción no válida!");
                    break;
            }
        } while (op == 1 || op == 2);
    }

}
