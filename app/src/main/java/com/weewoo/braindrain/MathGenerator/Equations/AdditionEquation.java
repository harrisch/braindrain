package com.weewoo.braindrain.MathGenerator.Equations;

public class AdditionEquation extends Equation {

    public AdditionEquation(int leftOperand, int rightOperand) {
        super(leftOperand, rightOperand);
    }

    public double getResult() {
        return this.leftOperand + this.rightOperand;
    }
}
