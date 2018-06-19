package com.weewoo.braindrain.MathGenerator.Equations;

public class SubtractionEquation extends Equation {

    public SubtractionEquation(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double getResult() {
        return this.leftOperand - this.rightOperand;
    }
}
