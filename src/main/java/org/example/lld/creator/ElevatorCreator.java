package org.example.lld.creator;

import org.example.lld.controller.ElevatorContrtoller;
import org.example.lld.model.ElevatorCar;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    public static List<ElevatorContrtoller> elevatorContrtollerList = new ArrayList<>();
    static {
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.id = 1;
        ElevatorContrtoller elevatorContrtoller1 = new ElevatorContrtoller(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar1.id = 2;
        ElevatorContrtoller elevatorContrtoller2 = new ElevatorContrtoller(elevatorCar2);

        elevatorContrtollerList.add(elevatorContrtoller1);
        elevatorContrtollerList.add(elevatorContrtoller2);

    }
}
