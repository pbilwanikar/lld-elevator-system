package org.example.lld.display;

import org.example.lld.model.Direction;

public class Display {
    public int floor;
    public Direction direction;

    public void setDisplay(int floor, Direction direction){
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay(){
        System.out.println(floor);
        System.out.println(direction);
    }
}
