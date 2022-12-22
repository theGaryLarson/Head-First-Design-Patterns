package com.patterns.interpreter;

/**
 * The TerminalExpression class represents a terminal symbol in the grammar. It
 * implements the interpretation of the language by simply returning the value
 * of the terminal symbol.
 */
class TerminalExpression extends AbstractExpression {
    private int value;
    
    public TerminalExpression(int value) {
        this.value = value;
    }
    
    @Override
    public void interpret(Context context) {
        context.setOutput(value);
    }
}