package com.liftcontrol.liftcontrol;

public class LiftControl {
    private Integer MAX_WEIGHT;
    private Integer MAX_FLOOR;
    private Integer weight;
    private Integer fromFloor;
    private Integer toFloor;
    public enum CONTROL { DOWN,STOP,UP}
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

    public Integer getToFloor() {
        return toFloor;
    }

    public String getFromFloorName() {
        if(this.getFromFloor() == 0)
            return "G";
        else if(this.getFromFloor() == MAX_FLOOR)
            return "TOP";
        else
            return String.valueOf(this.getFromFloor());
    }

    public String getToFloorName() {
        if(this.getToFloor() == 0)
            return "G";
        else if(this.getToFloor() == MAX_FLOOR)
            return "TOP";
        else
            return String.valueOf(this.getToFloor());
    }

    public void setToFloor(Integer toFloor) {
        this.toFloor = toFloor;
    }

    public Integer getFromFloor() {
        return fromFloor;
    }

    public void setFromFloor(Integer floor) {
        this.fromFloor = floor;
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

    public CONTROL getCurrentStatus(){
        return this.liftControlStatus;
    }

    public void operate(){
        if(this.getWeight() > this.MAX_WEIGHT){
            this.controlStop();
        }else{
            if(this.getFromFloor() < this.getToFloor()){
                this.controlUp();
            }else if(this.getFromFloor() > this.getToFloor()) {
                this.controlDown();
            }else if(this.getFromFloor() == this.getToFloor()){
                this.controlStop();
            }
        }
    }
}
