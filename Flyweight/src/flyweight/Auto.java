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
public class Auto implements IVehiculo{
    
    public String color;
    public String No_Placa;
    public String propietario;
    
public Auto(String color, String No_Placa, String propietario){
    
    this.color = color;
    this.No_Placa = No_Placa;
    this.propietario = propietario;
    
}
    
    @Override
    public String mostrarDetalle() {
        return "No_Placa: " + this.No_Placa + ", Color: " + this.color + ", propietario: "+ this.propietario;
    }
    
}
