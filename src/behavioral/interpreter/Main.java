package behavioral.interpreter;

public class Main {

    public static void main(String[] args) {

        Expression ali = new TerminalExpression("Ali");
        Expression reza = new TerminalExpression("Reza");

        Expression orExpr = new OrExpression(ali, reza);

        System.out.println(orExpr.interpret("Reza is here")); // true

        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        Expression andExpr = new AndExpression(java, spring);

        System.out.println(andExpr.interpret("Java Spring Framework")); // true
    }
}