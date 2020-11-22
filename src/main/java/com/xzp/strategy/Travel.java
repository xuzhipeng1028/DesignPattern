package com.xzp.strategy;

/**
 * @author xzp
 * @date 2020.11.22 16:06
 */
public class Travel {
    private VehicleStrategy vehicleStrategy;

    public Travel(){

    }

    public Travel(VehicleStrategy vehicleStrategy){
        this.vehicleStrategy = vehicleStrategy;
    }

    public VehicleStrategy getVehicleStrategy() {
        return vehicleStrategy;
    }

    public void setVehicleStrategy(VehicleStrategy vehicleStrategy) {
        this.vehicleStrategy = vehicleStrategy;
    }

    public void travel(){
        vehicleStrategy.go();
    }
}
