package com.weewoo.braindrain.MathGenerator.Equations;

public class MultiplicationEquation extends Equation {

    public MultiplicationEquation(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double getResult() {
        return this.leftOperand * this.rightOperand;
    }
}
