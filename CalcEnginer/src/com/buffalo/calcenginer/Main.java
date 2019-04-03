package com.buffalo.calcenginer;

public class Main {

    public static void main(String[] args) {
       /* MathEquation testEquations = new MathEquation();
        testEquations.execute();
        System.out.println("test=");
        System.out.println(testEquations.getResult());*/
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('a', 100.0d,50.0d);
        equations[1] = new MathEquation('d', 100.0d,50.0d);
        equations[2] = new MathEquation('s', 100.0d,50.0d);
        equations[3] = new MathEquation('m', 100.0d,50.0d);
        for (MathEquation equation:equations) {
            equation.execute();
            System.out.println("result =");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble,rightDouble);
        System.out.println("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.println("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double)leftInt,rightInt);
        System.out.println("result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators ={
                new Divider(100.0d,50.0d),
                new Adder(25.0d,5.0d),
                new Subtractor(25.0d,5.0d),
                new Multiplier(5.0d,5.0d)
        };

        for (CalculateBase calculator : calculators){
            calculator.calulate();
            System.out.println("result=");
            System.out.println(calculator.getResult());
        }
    }
}
