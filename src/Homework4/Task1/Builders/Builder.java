package Homework4.Task1.Builders;

import Homework4.Task1.Car;
import Homework4.Task1.CarParts.Engine;
import Homework4.Task1.CarParts.Transmission;
import Homework4.Task1.CarParts.Wheel;

public interface Builder {
    /*
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;

    private String tires;

     */

    Builder setBodyType(String bodyType);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setWheels(Wheel wheels);
    Builder setColor(String color);
    Builder setTires(String tires);
    Car build();
}
