package com.weewoo.braindrain.MathGenerator.Generators;

import com.weewoo.braindrain.MathGenerator.Equations.AdditionEquation;
import com.weewoo.braindrain.MathGenerator.Equations.Equation;

public class AdditionEquationGenerator extends EquationGenerator{
    public AdditionEquationGenerator(Difficulty difficulty) {
        super(difficulty);
    }

    public Equation generate() {
        return new AdditionEquation(1,1);
    }
}
