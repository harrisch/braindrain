package com.weewoo.braindrain.MathGenerator.Equations;

public class DivisionEquation extends Equation {

    public DivisionEquation(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double getResult() {
        return this.leftOperand / this.rightOperand;
    }
}
