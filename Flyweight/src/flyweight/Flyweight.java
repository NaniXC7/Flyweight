/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author NaniXC7
 */
public class Flyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlyweightFactory ff = new FlyweightFactory();
        String No_Placa[] = {"ARG123","CHL123","PER123"};
        String colores[] ={"Negro","Azul","Rojo"};
        String propietario[] ={"Carlos", "Pedro", "Julio"};
  
        ff.listarAutos(colores, No_Placa, propietario);
        
    }
    
}
