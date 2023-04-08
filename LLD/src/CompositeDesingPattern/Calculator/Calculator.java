package CompositeDesingPattern.Calculator;

public class Calculator {
    public static void main(String[] args) {
         ArithmeticExpression two = new Number(2);
         ArithmeticExpression three = new Number(3);
         Number seven  = new Number(7);

         ArithmeticExpression expression1 = new Expression(three,seven,Operation.ADD);
         ArithmeticExpression expression2 = new Expression(two,expression1,Operation.MUL);


        System.out.println("Child Expression result "+expression1.evaluate());

        System.out.println("Final Result "+ expression2.evaluate());



    }
}
