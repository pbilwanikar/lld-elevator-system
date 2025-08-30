package org.example.lld.model;

import java.util.List;

public class Building {
    List<Floors> floorList;
    public Building(List<Floors> floorList){
        this.floorList = floorList;
    }
    public void addFloors(Floors newFloors){
        floorList.add(newFloors);
    }
    public void removeFloors(Floors newFloors){
        floorList.remove(newFloors);
    }
    public List<Floors> geFloorList(){
        return floorList;
    }

}
