package com.weewoo.braindrain.MathGenerator.Generators;

import com.weewoo.braindrain.MathGenerator.Equations.Equation;
import com.weewoo.braindrain.MathGenerator.Equations.DivisionEquation;

public class DivisionEquationGenerator extends EquationGenerator{

    public DivisionEquationGenerator(Difficulty difficulty) {
        super(difficulty);
    }

    public Equation generate() {
        return new DivisionEquation(1,1);
    }
}
