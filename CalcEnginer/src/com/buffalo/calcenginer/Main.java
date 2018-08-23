package com.buffalo.calcenginer;

public class Main {

    public static void main(String[] args) {
        MathEquation testEquations = new MathEquation();
        testEquations.execute();
        System.out.println("test=");
        System.out.println(testEquations.getResult());
       /* MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d,50.0d,'d');
        equations[1] = create(100.0d,50.0d,'a');
        equations[2] = create(100.0d,50.0d,'s');
        equations[3] = create(100.0d,50.0d,'m');
        for (MathEquation equation:equations) {
            equation.execute();
            System.out.println("result =");
            System.out.println(equation.getResult());
        }*/
    }
    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.setLeftVals(leftVal);
        equation.setRightVals(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
