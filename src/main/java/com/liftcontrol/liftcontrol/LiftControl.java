package com.liftcontrol.liftcontrol;

public class LiftControl {
    private Integer MAX_WEIGHT;
    private Integer MAX_FLOOR;
    private Integer weight;
    private Integer floor;
    private enum CONTROL { DOWN,STOP,UP}
    private CONTROL liftControlStatus;

    public LiftControl(Integer maxWeight, Integer maxFloor){
        this.MAX_WEIGHT = maxWeight;
        this.MAX_FLOOR = maxFloor;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void controlUp(){
        this.liftControlStatus = CONTROL.UP;
    }

    public void controlDown(){
        this.liftControlStatus = CONTROL.DOWN;
    }

    public void controlStop(){
        this.liftControlStatus = CONTROL.STOP;
    }
}
