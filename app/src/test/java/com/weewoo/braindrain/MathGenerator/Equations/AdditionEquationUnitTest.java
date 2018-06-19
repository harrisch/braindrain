package com.weewoo.braindrain.MathGenerator.Equations;

import com.weewoo.braindrain.MathGenerator.Equations.AdditionEquation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionEquationUnitTest {
    @Test
    public void getResultIsCorrect() {
        AdditionEquation ae = new AdditionEquation(1,1);
        assertEquals(2, ae.getResult(), 0);
    }
}
