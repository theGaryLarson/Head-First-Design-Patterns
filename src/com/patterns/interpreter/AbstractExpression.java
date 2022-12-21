package com.patterns.interpreter;

/**
 * The AbstractExpression class defines the interface for the interpretation of
 * the language.
 */
abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
