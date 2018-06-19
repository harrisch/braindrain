package com.weewoo.braindrain.MathGenerator.Generators;

import com.weewoo.braindrain.MathGenerator.Equations.Equation;
import com.weewoo.braindrain.MathGenerator.Equations.SubtractionEquation;

public class SubtractionEquationGenerator extends EquationGenerator{

    public SubtractionEquationGenerator(Difficulty difficulty) {
        super(difficulty);
    }

    public Equation generate() {
        return new SubtractionEquation(1,1);
    }
}
