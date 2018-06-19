package com.weewoo.braindrain.MathGenerator.Equations;

import com.weewoo.braindrain.MathGenerator.Equations.SubtractionEquation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionEquationUnitTest {
    @Test
    public void getResultIsCorrect() {
        SubtractionEquation ae = new SubtractionEquation(5,1);
        assertEquals(4, ae.getResult(), 0);
    }
}
