package com.buffalo.calcenginer;

public class Adder extends CalculateBase {
    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calulate() {
        double value = getLeftVals() + getRightVals();
        setResult(value);
    }
}
