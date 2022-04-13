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
public class Vehiculo {
    //Atributos
    private String marca;
    private double precio;
    private String modelo;
    
    //Constructor
    public Vehiculo(String marca, double precio, String modelo){
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
    }
    //Método
    public void imprimirDatos(){
        System.out.println("La marca del vehículo es "+this.marca+", cuesta $"+this.precio+" y es modelo "+this.modelo+".");
    }
}
