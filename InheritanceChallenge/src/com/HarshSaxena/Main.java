package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle vehicle = new Vehicle("truck", 1, 4, 6, "HMV");
        Car car = new Car("car", 6, "LMV", "Ignis", "Hatchback", 4, 4  );
        vehicle.state();
        car.state();
        Ignis ignis = new Ignis("Automatic",5, "LMV", "Ignis Delta", "AMT", 5, 5, "auto", "petrol");
        ignis.move(6);
        ignis.changeGear(5);

    }
}
