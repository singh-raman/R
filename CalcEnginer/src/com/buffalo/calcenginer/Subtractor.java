package com.buffalo.calcenginer;

public class Subtractor extends CalculateBase {
    public Subtractor(){}
    public Subtractor(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calulate() {
        double value = getLeftVals() - getResult();
        setResult(value);
    }
}
