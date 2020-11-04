package com.HarshSaxena;

public class Ignis extends  Car{
    public String climateControl;
    public String engine;

    public Ignis(String type, int gears, String size, String name, String category, int seating, int airbags, String climateControl, String engine) {
        super(type, gears, size, name, category, seating, airbags);
        this.climateControl = climateControl;
        this.engine = engine;
    }

    public void cruiseControl(){
        System.out.println("Ignis.cruisecontrol() method is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Ignis.move() method is called.  Ignis is moving with speed" + speed );
        super.move(speed);
    }
    public void changeGear(int gearNumber){
        super.changeHighGears(gearNumber);
    }
}
