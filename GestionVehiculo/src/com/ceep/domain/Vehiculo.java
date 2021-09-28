/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author Alumno Mañana
 */
public class Vehiculo {
        
    private String matricula, marca, modelo, color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    
    
    

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void getAtributo() {
        System.out.println("Matricula: " + matricula  );
        System.out.println("Marca: " + marca  );
        System.out.println("Modelo: " + modelo );
        System.out.println("Color: " + color  );
        System.out.println("Tarifa: " + tarifa  );
        System.out.println("Disponible: " + disponible  );
        
    }
    
}
