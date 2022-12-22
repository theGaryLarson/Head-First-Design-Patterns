package com.patterns.interpreter;

/**
 * The NonterminalExpression class represents a nonterminal symbol in the
 * grammar. It implements the interpretation of the language by delegating the
 * interpretation to its children.
 */
class NonterminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;
    private char operator;
    
    public NonterminalExpression(AbstractExpression left, AbstractExpression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
    
    @Override
    public void interpret(Context context) {
        left.interpret(context);
        int leftValue = context.getOutput();
        right.interpret(context);
        int rightValue = context.getOutput();
        switch (operator) {
            case '+':
                context.setOutput(leftValue + rightValue);
                break;
            case '-':
                context.setOutput(leftValue - rightValue);
                break;
            case '*':
                context.setOutput(leftValue * rightValue);
                break;
            case '/':
                context.setOutput(leftValue / rightValue);
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }
    }
}