package com.weewoo.braindrain.MathGenerator.Equations;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationEquationUnitTest {
    @Test
    public void getResultIsCorrect() {
        MultiplicationEquation ae = new MultiplicationEquation(4,12);
        assertEquals(48, ae.getResult(), 0);
    }
}
