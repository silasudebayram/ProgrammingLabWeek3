/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek3;

/**
 *
 * @author SILA SUDE
 */
public class Car {
    protected String plateNumber;
    protected String model;
    protected double mileage=0;
    protected double fuelLevel;
    protected double tankCapacity;
    
    Car(String plateNumber,String model,double mileage,double fuelLevel,double tankCapacity){
        this.plateNumber=plateNumber;
        this.model=model;
        this.mileage=mileage;
        this.fuelLevel=fuelLevel;
        this.tankCapacity=tankCapacity;
    }
    public void drive(double km){
        if(km/10> fuelLevel){
        System.out.println("Not enough fuel for this trip !");
        }else{
            mileage+=km;
            fuelLevel-=(km/10);
        }
        System.out.println("Driving "+km+" kilometers");
    }
    public void refuel(double amount){
        if(fuelLevel>tankCapacity){
        System.out.println("Tank is full , extra fuel discarded");
        }
        fuelLevel+=amount;
        System.out.println("Refueling "+amount+" liters.");
    }
    public void checkStatus(){
        System.out.println("Current Mileage : "+mileage);
        System.out.println("Fuel Level "+fuelLevel);
        if(fuelLevel<tankCapacity){
        System.out.println("Low fuel warning !");
        }

    }
           
    
}
