package Homework4.Task1;

import Homework4.Task1.Builders.Builder;
import Homework4.Task1.Builders.EngineBuilder;
import Homework4.Task1.Builders.TransmissionBuilder;
import Homework4.Task1.Builders.WheelBuilder;
import Homework4.Task1.CarParts.Engine;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car buildJeep(String color, String tires){
        Car car = builder.setBodyType("jeep")
                .setEngine(new EngineBuilder().setFuelType("diesel").setTorque(400).setVolume(180).setPower(300).build())
                .setTransmission(new TransmissionBuilder().setAutomatic(false).setNumberOfGears(6).build())
                .setWheels(new WheelBuilder().setDiameter(22).setMaterial("rubber").build())
                .setColor(color).setTires(tires).build();
        System.out.println("Jeep was built");
        return car;
    }

    public Car buildSedan(String color, String tires){
        Car car = builder.setBodyType("sedan")
                .setEngine(new EngineBuilder().setFuelType("petrol").setTorque(350).setVolume(120).setPower(200).build())
                .setTransmission(new TransmissionBuilder().setAutomatic(false).setNumberOfGears(5).build())
                .setWheels(new WheelBuilder().setDiameter(16).setMaterial("rubber").build())
                .setColor(color).setTires(tires).build();
        System.out.println("Sedan was built");
        return car;
    }



}
