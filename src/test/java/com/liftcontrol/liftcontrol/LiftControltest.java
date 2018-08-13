package com.liftcontrol.liftcontrol;

import org.junit.Test;

public class LiftControltest {
    @Test
    public void calculateSum() {
        assertEquals(expectedResult,actualResult);
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;
    }

}
