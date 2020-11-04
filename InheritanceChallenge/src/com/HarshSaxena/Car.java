package com.HarshSaxena;

public class Car extends Vehicle {

    private String category;
    private int seating;
    private int airbags;

    public Car(String type, int gears, String size, String name, String category, int seating, int airbags) {
        super(type, 1, 4, gears, size);
        this.category = category;
        this.seating = seating;
        this.airbags = airbags;
    }
    public void displacement(){
        System.out.println("Car.displacement() method is called");
    }

    @Override
    public void state() {
        System.out.println("Car.state() method is called");
        displacement();
        super.state();
    }
    public void move(int speed){
        System.out.println("Car.move() method is called. Car is moving with speed " + speed);
    }
    public void changeGears(int gearNumber){
        System.out.println("Car.changeGears() method is called.  Car is running in gear number " + gearNumber);
    }

}
