package com.weewoo.braindrain.MathGenerator;

import com.weewoo.braindrain.MathGenerator.Equations.Equation;
import com.weewoo.braindrain.MathGenerator.Generators.AdditionEquationGenerator;
import com.weewoo.braindrain.MathGenerator.Generators.DivisionEquationGenerator;
import com.weewoo.braindrain.MathGenerator.Generators.EquationGenerator;
import com.weewoo.braindrain.MathGenerator.Generators.MultiplicationEquationGenerator;
import com.weewoo.braindrain.MathGenerator.Generators.SubtractionEquationGenerator;
import com.weewoo.braindrain.MathGenerator.Generators.EquationGenerator.Operator;
import com.weewoo.braindrain.MathGenerator.Generators.EquationGenerator.Difficulty;

import java.util.ArrayList;
import java.util.EnumMap;

public class EquationFactory {
    private final EnumMap<Operator, EquationGenerator> equationGenerators = new EnumMap<>(Operator.class);

    private Difficulty difficulty;
    private ArrayList<Operator> modes;

    public void EquationFactory(ArrayList<Operator> modes, Difficulty difficulty) {
        equationGenerators.put(Operator.ADD, new AdditionEquationGenerator(difficulty));
        equationGenerators.put(Operator.SUBTRACT, new SubtractionEquationGenerator(difficulty));
        equationGenerators.put(Operator.MULTIPLY, new MultiplicationEquationGenerator(difficulty));
        equationGenerators.put(Operator.DIVIDE, new DivisionEquationGenerator(difficulty));

        this.modes = modes;
        this.difficulty = difficulty;
    }

    public Equation generateEquation() {
        return equationGenerators.get(modes.get((int)(Math.random()*modes.size()))).generate();
    }
}
