package org.example.lld.model;

import org.example.lld.display.Display;

public class ElevatorCar {
    public int id;
    public int currenFloor;
    public Display display;
    public Direction direction;
    public Status status;
    public InternalButtons internalButton;
    public ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        display = new Display();
        internalButton = new InternalButtons();
        status = Status.IDLE;
        currenFloor=0;
        direction=Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }

    public void showDisplay(){
        display.showDisplay();
    }

    public void pressButton(int destinaion){
        internalButton.pressButton(destinaion, this);
    }
    public void setDisplay() {
        this.display.setDisplay(currenFloor, direction);
    }
    boolean moveElevator(Direction dir, int destinaionFloor){
        int startFloor = currenFloor;
        if(dir==Direction.UP){
            for(int i =startFloor; i<=destinaionFloor;i++){
                this.currenFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i==destinaionFloor){
                    return true;
                }
            }
        }
        if(dir ==Direction.DOWN){
            for(int i = startFloor; i<=destinaionFloor; i--){
                this.currenFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i==destinaionFloor){
                    return true;
                }
            }
        }
        return false;
    }
}
