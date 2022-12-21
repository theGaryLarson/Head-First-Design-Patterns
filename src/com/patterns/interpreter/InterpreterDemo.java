package com.patterns.interpreter;

/**
 * The client code creates the tree of terminal and nonterminal expressions and
 * assigns it to a Context object. The client then interprets the tree by
 * calling the interpret method on the root of the tree.
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        // Build the expression tree
        AbstractExpression expression = new NonterminalExpression(
                new TerminalExpression(3),
                new TerminalExpression(4),
                '+'
        );
        
        // Interpret the expression
        Context context = new Context("3 + 4");
        expression.interpret(context);
        
        System.out.println(context.getInput() + " = " + context.getOutput());
    }
}
/*This demo demonstrates how the Interpreter pattern can be used to interpret a simple arithmetic language.
The language consists of terminal symbols, which are integer values, and nonterminal symbols, which are arithmetic
operators (+, -, *, /).

The demo defines three classes:

Context: This class represents the context in which the interpretation will be performed. It stores the input string
(which consists of a series of terminal and nonterminal symbols) and the output of the interpretation.

AbstractExpression: This is the base class for terminal and nonterminal expressions. It defines the interpret method,
which is used to interpret the expression.

TerminalExpression: This class represents a terminal symbol in the language (an integer value). When it is interpreted,
it simply returns its value.

Non-terminalExpression: This class represents a non-terminal symbol in the language (an arithmetic operator).
When it is interpreted, it delegates the interpretation to its two children (which are themselves AbstractExpression
objects) and applies the operator to the values returned by the children.

The main method creates a tree of terminal and non-terminal expressions that represents the expression "3 + 4",
and assigns it to a Context object. It then calls the interpret method on the root of the tree, which causes
the expression to be evaluated and the result to be stored in the Context object. Finally, it prints the input
string and the output of the interpretation.

In this example, the output would be "3 + 4 = 7".*/
