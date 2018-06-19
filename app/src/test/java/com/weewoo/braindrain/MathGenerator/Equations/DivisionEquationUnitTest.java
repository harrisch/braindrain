package com.weewoo.braindrain.MathGenerator.Equations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionEquationUnitTest {
    @Test
    public void getResultIsCorrect() {
        DivisionEquation ae = new DivisionEquation(12,4);
        assertEquals(3, ae.getResult(), 0);
    }
}
