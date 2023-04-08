package CompositeDesingPattern.Calculator;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpresion;
    Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpresion, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpresion = rightExpresion;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
         switch (operation){
             case ADD:
                 return leftExpression.evaluate() + rightExpresion.evaluate();
             case SUB:
                 return leftExpression.evaluate() - rightExpresion.evaluate();
             case MUL:
                 return leftExpression.evaluate() * rightExpresion.evaluate();
             case DIV:
                 return leftExpression.evaluate() / rightExpresion.evaluate();
             case MOD:
                 return leftExpression.evaluate()% rightExpresion.evaluate();
         }
        System.out.println("Enter the right Expression");
         return 0;
    }
}
