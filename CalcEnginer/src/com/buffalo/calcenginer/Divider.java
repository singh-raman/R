package com.buffalo.calcenginer;

public class Divider extends CalculateBase {
    public Divider(){}
    public Divider(double leftVal,double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calulate() {
        double value= getLeftVals()/getRightVals();
        setResult(value);
    }
}
