/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_vehiculo;

/**
 *
 * @author Dell
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Instanciamos el objeto
       Vehiculo carro1 = new Vehiculo("Mazda", 400000.00, "2022");
       
       //Utilizamos el método
       carro1.imprimirDatos();
    }
    
}
