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
public class FlyweightFactory {
    
    IVehiculo auto;
    
public void listarAutos(String color[], String No_Placa[], String propietario[]){
  
    for (int i = 0; i < propietario.length; i++) {
        auto = new Auto(color[i], No_Placa[i], propietario[i]);   
        System.out.println("Datos del auto\n" + auto.mostrarDetalle());  
    }
  
}

}
