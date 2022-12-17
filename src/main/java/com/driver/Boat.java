package com.driver;

public class Boat implements WaterVehicle{

    @Override
    public String getVehicleName() {
        return VehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return VehicleCapacity;
    }

    private String VehicleName;
    private int VehicleCapacity;

    public Boat(String name, int capacity){
            this.VehicleName = name;
            this.VehicleCapacity = capacity;
    }

}
