package com.liftcontrol.liftcontrol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiftControltest {
    @Test
    public void testOverWeight() {
        LiftControl lift = new LiftControl(1000,10);
        lift.setWeight(1001);
        lift.operate();
        assertEquals(LiftControl.CONTROL.STOP,lift.getCurrentStatus());
    }

    @Test
    public void testNotOverWeightFromGtoTop() {
        LiftControl lift = new LiftControl(1000,10);
        lift.setWeight(300);
        lift.setFromFloor(0);
        lift.setToFloor(10);
        lift.operate();
        assertEquals(LiftControl.CONTROL.UP,lift.getCurrentStatus());
    }

    @Test
    public void testNotOverWeightFromToptoG() {
        LiftControl lift = new LiftControl(1000,10);
        lift.setWeight(500);
        lift.setFromFloor(10);
        lift.setToFloor(0);
        lift.operate();
        assertEquals(LiftControl.CONTROL.DOWN,lift.getCurrentStatus());
    }

    @Test
    public void testNotOverWeightFrom8to5() {
        LiftControl lift = new LiftControl(1000,10);
        lift.setWeight(500);
        lift.setFromFloor(8);
        lift.setToFloor(5);
        lift.operate();
        assertEquals(LiftControl.CONTROL.DOWN,lift.getCurrentStatus());
    }

    @Test
    public void testNotOverWeightFrom5to5() {
        LiftControl lift = new LiftControl(1000,10);
        lift.setWeight(500);
        lift.setFromFloor(5);
        lift.setToFloor(5);
        lift.operate();
        assertEquals(LiftControl.CONTROL.STOP,lift.getCurrentStatus());
    }

}
