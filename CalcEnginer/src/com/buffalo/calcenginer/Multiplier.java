package com.buffalo.calcenginer;

public class Multiplier extends CalculateBase {
    public Multiplier(){}
    public Multiplier (double leftVal,double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calulate() {
        double value = getLeftVals() * getRightVals();
        setResult(value);
    }
}
