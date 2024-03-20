package Homework6.Task2;

import Homework6.Task2.CarParts.Engine;
import Homework6.Task2.CarParts.Transmission;
import Homework6.Task2.CarParts.Wheel;

public class Car {
    private String bodyType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheels;
    private String color;

    private String tires;

    public Car(String bodyType, Engine engine, Transmission transmission, Wheel wheels, String color, String tires) {
        this.bodyType = bodyType;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyType + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", tires='" + tires + '\'' +
                '}';
    }
}
