package com.weewoo.braindrain.MathGenerator.Equations;

public abstract class Equation {
    protected int leftOperand;
    protected int rightOperand;

    public Equation(int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public abstract double getResult();

}
