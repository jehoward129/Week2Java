/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author jehow
 */
public class Car {
    String make, model;
    int year;
    double speed;
    boolean engineOn;
    
    public Car(){
        
    }
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    public Car(String make, String model, int year, double speed, boolean engineOn){
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.engineOn = engineOn;
    }
    public void DisplayInfo(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(speed);
        System.out.println(engineOn);
    }
    
    public void Start(){
        this.engineOn = true;
    }
    public void Accelerate(){
        this.speed += 50;
    }
    public void Brake(){
        this.speed -= 25;
    }
    public void Stop(){
        if (this.speed == 0){
            engineOn = false;
        }
    }
    public static void main(String[] args) {
 
                
    }
    
}
