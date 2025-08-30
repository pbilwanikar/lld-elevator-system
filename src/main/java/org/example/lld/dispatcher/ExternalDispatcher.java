package org.example.lld.dispatcher;

import org.example.lld.controller.ElevatorContrtoller;
import org.example.lld.creator.ElevatorCreator;
import org.example.lld.model.Direction;

import java.util.List;

public class ExternalDispatcher {
    List<ElevatorContrtoller> elevatoronttrollerList = ElevatorCreator.elevatorContrtollerList;

    public void submitExternalRequest(int floor, Direction direction){
        //even odd logic

        for(ElevatorContrtoller elevatorContrtoller: elevatoronttrollerList){
            int elevatorID = elevatorContrtoller.elevatorCar.id;
            if(elevatorID%2==1 && floor%2==1){
                elevatorContrtoller.submitExternalRequest(floor, direction);
            }
            else if(elevatorID%2==0 && floor%2==0){
                elevatorContrtoller.submitExternalRequest(floor, direction);
            }
        }
    }

}
