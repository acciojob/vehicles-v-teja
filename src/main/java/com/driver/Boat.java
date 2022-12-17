package com.driver;

public class Boat implements WaterVehicle{
    @Override
    public String getVehicleName() {
        return "BOAT";
    }

    @Override
    public int getVehicleCapacity() {
        return 10;
    }
}
