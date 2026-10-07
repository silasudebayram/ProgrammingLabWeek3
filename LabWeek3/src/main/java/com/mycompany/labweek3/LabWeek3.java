/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labweek3;

/**
 *
 * @author SILA SUDE
 */
public class LabWeek3 {

    public static void main(String[] args) {
        Car car =new Car("38 AB 123","TOYOTA",50.0,400.0,100.0);
        System.out.println("Plate Number : "+car.plateNumber);
        System.out.println("Model : "+car.model);
        System.out.println("Mileage : "+car.mileage);
        System.out.println("Fuel Level : "+car.fuelLevel);
        System.out.println("Tank Capacity : "+car.tankCapacity);
        car.drive(10000000);
        car.refuel(10000000);
        car.checkStatus();
    }
}
