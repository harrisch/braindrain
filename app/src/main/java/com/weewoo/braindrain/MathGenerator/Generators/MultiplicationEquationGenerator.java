package com.weewoo.braindrain.MathGenerator.Generators;

import com.weewoo.braindrain.MathGenerator.Equations.Equation;
import com.weewoo.braindrain.MathGenerator.Equations.MultiplicationEquation;

public class MultiplicationEquationGenerator extends EquationGenerator{
    public MultiplicationEquationGenerator(Difficulty difficulty) {
        super(difficulty);
    }

    public Equation generate() {
        return new MultiplicationEquation(1,1);
    }
}
