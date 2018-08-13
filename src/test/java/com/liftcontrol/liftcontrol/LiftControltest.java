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
    public void testNotOverWeight() {

    }



}
