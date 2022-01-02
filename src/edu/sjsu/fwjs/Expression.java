package edu.sjsu.fwjs;

import java.util.ArrayList;
import java.util.List;

/**
 * FWJS expressions.
 */
public interface Expression {
    /**
     * Evaluate the expression in the context of the specified environment.
     */
    public Value evaluate(Environment env);
}

// NOTE: Using package access so that all implementations of Expression
// can be included in the same file.

/**
 * FWJS constants.
 */
class ValueExpr implements Expression {
    private Value val;
    public ValueExpr(Value v) {
        this.val = v;
    }
    public Value evaluate(Environment env) {
        return this.val;
    }
}

/**
 * Expressions that are a FWJS variable.
 */
class VarExpr implements Expression {
    private String varName;
    public VarExpr(String varName) {
        this.varName = varName;
    }
    public Value evaluate(Environment env) {
        return env.resolveVar(varName);
    }
}

/**
 * A print expression.
 */
class PrintExpr implements Expression {
    private Expression exp;
    public PrintExpr(Expression exp) {
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        Value v = exp.evaluate(env);
        System.out.println(v.toString());
        return v;
    }
}
/**
 * Binary operators (+, -, *, etc).
 * Currently only numbers are supported.
 */
class BinOpExpr implements Expression {
    private Op op;
    private Expression e1;
    private Expression e2;
    public BinOpExpr(Op op, Expression e1, Expression e2) {
        this.op = op;
        this.e1 = e1;
        this.e2 = e2;
    }

    @SuppressWarnings("incomplete-switch")
    public Value evaluate(Environment env) {
        int val1 = ((IntVal) e1.evaluate(env)).toInt(); // Gets the first value.
        int val2 = ((IntVal) e2.evaluate(env)).toInt(); // Gets the second value.
        Value result = null;
        
        // Checks to see what the operator is and performs the corresponding operation.
        if (op == Op.ADD)
        {
        	result = new IntVal(val1 + val2);
        }
        
        else if (op == Op.SUBTRACT)
        {
        	result = new IntVal(val1 - val2);
        }
        
        else if (op == Op.MULTIPLY)
        {
        	result = new IntVal(val1 * val2);
        }
        
        else if (op == Op.DIVIDE)
        {
        	result = new IntVal(val1 / val2);
        }
        
        else if (op == Op.MOD)
        {
        	result = new IntVal(val1 % val2);
        }
        
        else if (op == Op.GT)
        {
        	result = new BoolVal(val1 > val2);
        }
        
        else if (op == Op.GE)
        {
        	result = new BoolVal(val1 >= val2);
        }
        
        else if (op == Op.LT)
        {
        	result = new BoolVal(val1 < val2);
        }
        
        else if (op == Op.LE)
        {
        	result = new BoolVal(val1 <= val2);
        }
        
        else if (op == Op.EQ)
        {
        	result = new BoolVal(val1 == val2);
        }
        
        else
        {
        	result = new NullVal();
        }
        
        return result;
    }
}

/**
 * If-then-else expressions.
 * Unlike JS, if expressions return a value.
 */
class IfExpr implements Expression {
    private Expression cond;
    private Expression thn;
    private Expression els;
    public IfExpr(Expression cond, Expression thn, Expression els) {
        this.cond = cond;
        this.thn = thn;
        this.els = els;
    }
    
    public Value evaluate(Environment env) {
        boolean condition = ((BoolVal) cond.evaluate(env)).toBoolean(); // Gets the boolean condition.
        
        // Evaluates the condition accordingly.
        if (condition)
        {
        	Value thenResult = thn.evaluate(env);
        	return thenResult;
        }
        
        else if (els != null)
        {
        	Value elseResult = els.evaluate(env);
        	return elseResult;
        }
        
        else
        {
        	return new NullVal();
        }
    }
}

/**
 * While statements (treated as expressions in FWJS, unlike JS).
 */
class WhileExpr implements Expression {
    private Expression cond;
    private Expression body;
    public WhileExpr(Expression cond, Expression body) {
        this.cond = cond;
        this.body = body;
    }
    
    public Value evaluate(Environment env) {
    	Value result = new NullVal();
    	
    	// Executes the while loop while the condition is true.
    	while (((BoolVal) cond.evaluate(env)).toBoolean())
    	{
    		result = body.evaluate(env);
    	}
    	
        return result;
    }
}

/**
 * Sequence expressions (i.e. 2 back-to-back expressions).
 */
class SeqExpr implements Expression {
    private Expression e1;
    private Expression e2;
    public SeqExpr(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    public Value evaluate(Environment env) {
        Value val1 = e1.evaluate(env); // Evaluates the first expression.
        Value val2 = e2.evaluate(env); // Evaluates the second expression.
        return val2;
    }
}

/**
 * Declaring a variable in the local scope.
 */
class VarDeclExpr implements Expression {
    private String varName;
    private Expression exp;
    public VarDeclExpr(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }
    
    public Value evaluate(Environment env) {
    	Value value = exp.evaluate(env);
        env.createVar(varName, value); // Declares the variable in the local scope.
        return value;
    }
}

/**
 * Updating an existing variable.
 * If the variable is not set already, it is added
 * to the global scope.
 */
class AssignExpr implements Expression {
    private String varName;
    private Expression e;
    public AssignExpr(String varName, Expression e) {
        this.varName = varName;
        this.e = e;
    }
    
    public Value evaluate(Environment env) {
        Value value = e.evaluate(env);
        env.updateVar(varName, value); // Updates the existing variable.
        return value;
    }
}

/**
 * A function declaration, which evaluates to a closure.
 */
class FunctionDeclExpr implements Expression {
    private List<String> params;
    private Expression body;
    public FunctionDeclExpr(List<String> params, Expression body) {
        this.params = params;
        this.body = body;
    }
    
    public Value evaluate(Environment env) {
    	// Returns a closure, including the environment used when it was defined.
        ClosureVal cv = new ClosureVal(params, body, env);
        return cv;
    }
}

/**
 * Function application.
 */
class FunctionAppExpr implements Expression {
    private Expression f;
    private List<Expression> args;
    public FunctionAppExpr(Expression f, List<Expression> args) {
        this.f = f;
        this.args = args;
    }
    
    public Value evaluate(Environment env) {
    	ClosureVal cv = (ClosureVal) f.evaluate(env); // Evaluates the 'f' expression and is casted to a ClosureVal.
        List<Value> evaluatedArguments = new ArrayList<Value>(); // Used to store the evaluated arguments.
        
        // Evaluates each argument and adds it to the list of evaluated arguments.
        for(int i = 0; i < args.size(); i++) {
    		evaluatedArguments.add(args.get(i).evaluate(env));
    	}
        
        Value val = cv.apply(evaluatedArguments); // Applies the closure.
        return val;
    }
}