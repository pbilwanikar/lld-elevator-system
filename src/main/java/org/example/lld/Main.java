package org.example.lld;

import org.example.lld.model.Building;
import org.example.lld.model.Floors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Floors> floorsList = new ArrayList<>();
        Floors floor1 = new Floors(1);
        Floors floor2 = new Floors(2);
        Floors floor3 = new Floors(3);
        Floors floor4 = new Floors(4);
        Floors floor5 = new Floors(5);

        floorsList.add(floor1);
        floorsList.add(floor2);
        floorsList.add(floor3);
        floorsList.add(floor4);
        floorsList.add(floor5);

        Building building = new Building(floorsList);
    }
}