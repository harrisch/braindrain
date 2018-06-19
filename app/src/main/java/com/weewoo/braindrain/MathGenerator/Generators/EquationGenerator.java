package com.weewoo.braindrain.MathGenerator.Generators;

import com.weewoo.braindrain.MathGenerator.Equations.Equation;

public abstract class EquationGenerator {
    public enum Difficulty {
        EASY, MEDIUM, HARD
    }

    public enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    protected Difficulty difficulty;

    public EquationGenerator(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public abstract Equation generate();
}
