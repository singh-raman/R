package com.buffalo.calcenginer;

public abstract class CalculateBase {
    private double leftVals;
    private double rightVals;
    private double result;

    public double getLeftVals(){
        return leftVals;
    }
    public void setLeftVals(double leftVals){
        this.leftVals=leftVals;
    }
    public double getRightVals(){
        return rightVals;
    }
    public void setRightVals(double rightVals){
        this.rightVals=rightVals;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double result){
        this.result=result;
    }

    public CalculateBase(){}
    public CalculateBase(double leftVals,double rightVals){
        this.leftVals=leftVals;
        this.rightVals=rightVals;
    }
    public abstract void calulate();
}
