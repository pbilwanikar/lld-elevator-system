package org.example.lld.model;

import org.example.lld.dispatcher.ExternalDispatcher;

public class Floors {
    int floorId;
    ExternalDispatcher externalDispatcher;

    public Floors(int floorId){
        this.floorId = floorId;
        this.externalDispatcher=new ExternalDispatcher();
    }
    public void pressButton( Direction dir){
        externalDispatcher.submitExternalRequest(floorId, dir);
    }
}
