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
public class Menu {
    public Menu(){
        System.out.println("**************************************");
        System.out.println("1.- Café");
        System.out.println("2.- Jugo de Naranja");
        System.out.println("3.- Jugo de Toronja");
        System.out.println("4.- Jugo Verde");
        System.out.println("5.- Malteada de Chocolate");
        System.out.println("6.- Malteada de Fresa");
        System.out.println("7.- Malteada de Vainilla");
        System.out.println("8.- Hot Cakes");
        System.out.println("9.- Waffles");
        System.out.println("10.- Chilaquiles Verdes");
        System.out.println("11.- Chilaquiles Rojos");
        System.out.println("12.- Chilaquiles con Mole");
        System.out.println("13.- Huevos con Jamón");
        System.out.println("14.- Huevos con Salchicha");
        System.out.println("15.- Huevos con Chorizo");
        System.out.println("16.- Huevos a la Mexicana");
        System.out.println("17.- Huevos Rancheros");
        System.out.println("18.- Huevos Divorciados");
        System.out.println("19.- Molletes");
        System.out.println("20.- Molletes con jamón");
        System.out.println("21.- Pan de dulce");
        System.out.println("22.- Quesadillas");
        System.out.println("23.- Sincronizadas");
        System.out.println("**************************************");
    }
    public String Menu(int op){
        String opcion = " ";
        
        switch(op){
            case 1:
                opcion = "Cafe    ";
                break;
            case 2:
                opcion = "Jugo Nar";
                break;
            case 3:
                opcion = "Jugo Tor";
                break;
            case 4:
                opcion = "Jugo Ver";
                break;
            case 5:
                opcion = "Malt Cho";
                break;
            case 6:
                opcion = "Malt Fre";
                break;
            case 7:
                opcion = "Malt Vai";
                break;
            case 8:
                opcion = "Hot Cake";
                break;
            case 9:
                opcion = "Waffles ";
                break;
            case 10:
                opcion = "Chil Ver";
                break;
            case 11:
                opcion = "Chil Roj";
                break;
            case 12:
                opcion = "Chil Mol";
                break;
            case 13:
                opcion = "Huev Jam";
                break;
            case 14:
                opcion = "Huev Sal";
                break;
            case 15:
                opcion = "Huev Cho";
                break;
            case 16:
                opcion = "Huev Mex";
                break;
            case 17:
                opcion = "Huev Ran";
                break;
            case 18:
                opcion = "Huev Div";
                break;
            case 19:
                opcion = "Molletes";
                break;
            case 20:
                opcion = "Moll Jam";
                break;
            case 21:
                opcion = "Pan Dulc";
                break;
            case 22:
                opcion = "Quesadil";
                break;
            case 23:
                opcion = "Sincroni";
                break;
        }
        
        return opcion;
    }
    
    public double Precio(int op){
       double precio = 0;
        
        switch(op){
            case 1:
                precio = 20;
                break;
            case 2:
                precio = 14.50;
                break;
            case 3:
                precio = 15.50;
                break;
            case 4:
                precio = 16;
                break;
            case 5:
                precio = 24.50;
                break;
            case 6:
                precio = 25.50;
                break;
            case 7:
                precio = 24;
                break;
            case 8:
                precio = 27.50;
                break;
            case 9:
                precio = 28.50;
                break;
            case 10:
                precio = 30;
                break;
            case 11:
                precio = 32;
                break;
            case 12:
                precio = 32.50;
                break;
            case 13:
                precio = 17.50;
                break;
            case 14:
                precio = 17.50;
                break;
            case 15:
                precio = 18;
                break;
            case 16:
                precio = 18.50;
                break;
            case 17:
                precio = 19;
                break;
            case 18:
                precio = 20.50;
                break;
            case 19:
                precio = 45;
                break;
            case 20:
                precio = 17;
                break;
            case 21:
                precio = 17.50;
                break;
            case 22:
                precio = 18;
                break;
            case 23:
                precio = 19.50;
                break;
        }
        
        return precio;
    }
}
