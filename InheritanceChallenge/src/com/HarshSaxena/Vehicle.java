package com.HarshSaxena;

public class Vehicle {
    private String type;
    private int steering;
    private int tyres;
    private int gears;
    private String size;

    public Vehicle(String type, int steering, int tyres, int gears, String size) {
        this.type = type;
        this.steering = steering;
        this.tyres = tyres;
        this.gears = gears;
        this.size = size;
    }
    public void state(){
        System.out.println("Vehicle.state() method is called");
    }

    public void changeHighGears(int gearNumber){
        System.out.println("Vehicle.changeGear() method is called.  Gear number is " + gearNumber);
    }
    public void changeLowGears(int gearNumber){
        System.out.println("Vehicle.changeGear() method is called.  Gear numbers is " + gearNumber);
    }


    public String getType() {
        return type;
    }

    public int getSteering() {
        return steering;
    }

    public int getTyres() {
        return tyres;
    }

    public int getGears() {
        return gears;
    }

    public String getSize() {
        return size;
    }
}
