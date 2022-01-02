package edu.sjsu.fwjs;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import edu.sjsu.fwjs.parser.FeatherweightJavaScriptBaseVisitor;
import edu.sjsu.fwjs.parser.FeatherweightJavaScriptParser;
import edu.sjsu.fwjs.parser.FeatherweightJavaScriptParser.ExprContext;

public class ExpressionBuilderVisitor extends FeatherweightJavaScriptBaseVisitor<Expression>{
    @Override
    public Expression visitProg(FeatherweightJavaScriptParser.ProgContext ctx) {
        List<Expression> stmts = new ArrayList<Expression>();
        for (int i=0; i<ctx.stat().size(); i++) {
            Expression exp = visit(ctx.stat(i));
            if (exp != null) stmts.add(exp);
        }
        return listToSeqExp(stmts);
    }
    
    @Override
    public Expression visitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx) {
        List<Expression> stmts = new ArrayList<Expression>();
        for (int i=1; i<ctx.getChildCount()-1; i++) {
            Expression exp = visit(ctx.getChild(i));
            stmts.add(exp);
        }
        return listToSeqExp(stmts);
    }

    @Override
    public Expression visitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx) {
        return visit(ctx.expr());
    }
    
    @Override
    public Expression visitParens(FeatherweightJavaScriptParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Expression visitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression thn = visit(ctx.block(0));
        Expression els = visit(ctx.block(1));
        return new IfExpr(cond, thn, els);
    }

    @Override
    public Expression visitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression thn = visit(ctx.block());
        return new IfExpr(cond, thn, null);
    }
    
    @Override
    public Expression visitWhile(FeatherweightJavaScriptParser.WhileContext ctx) {
    	Expression cond = visit(ctx.expr());
    	Expression body = visit(ctx.block());
		WhileExpr whileExpr = new WhileExpr(cond, body);
		return whileExpr;
    }
    
    @Override
    public Expression visitPrint(FeatherweightJavaScriptParser.PrintContext ctx) {
    	Expression expr = visit(ctx.expr());
    	PrintExpr printExpr = new PrintExpr(expr);
    	return printExpr;
    }

    @Override
    public Expression visitInt(FeatherweightJavaScriptParser.IntContext ctx) {
        int val = Integer.valueOf(ctx.INT().getText());
        return new ValueExpr(new IntVal(val));
    }
    
    @Override
    public Expression visitBool(FeatherweightJavaScriptParser.BoolContext ctx) {
    	boolean val = Boolean.valueOf(ctx.BOOL().getText());
    	ValueExpr valExpr = new ValueExpr(new BoolVal(val));
    	return valExpr;
    }
    
    @Override
    public Expression visitNull(FeatherweightJavaScriptParser.NullContext ctx) {
    	ValueExpr nullExpr = new ValueExpr(new NullVal());
    	return nullExpr;
    }
    
    @Override
    public Expression visitFuncDec(FeatherweightJavaScriptParser.FuncDecContext ctx) {
    	List<String> params = new ArrayList<String>();
    	List<TerminalNode> nodes = ctx.params().ID();
  
    	for(TerminalNode node : nodes) {
    		params.add(String.valueOf(node));
    	}
    	
    	Expression body = visit(ctx.block());
    	FunctionDeclExpr funcDecExpr = new FunctionDeclExpr(params, body);
    	return funcDecExpr;
    }
    
    @Override
	public Expression visitFuncApp(FeatherweightJavaScriptParser.FuncAppContext ctx) {
    	Expression expr = visit(ctx.expr());
    	List<Expression> args = new ArrayList<Expression>();
    	List<ExprContext> exprs = ctx.args().expr();
    	
    	for(ExprContext ec : exprs) {
    		args.add(visit(ec));
    	}
    	
    	FunctionAppExpr funcAppExpr = new FunctionAppExpr(expr, args);
    	return funcAppExpr;
    }
    
    @Override
    public Expression visitVarDec(FeatherweightJavaScriptParser.VarDecContext ctx) {
    	String varName = String.valueOf(ctx.ID().getText());
    	Expression expr = visit(ctx.expr());
    	VarDeclExpr varDecExpr = new VarDeclExpr(varName, expr);
    	return varDecExpr;
    }
    
    @Override
    public Expression visitAssign(FeatherweightJavaScriptParser.AssignContext ctx) {
    	String varName = String.valueOf(ctx.ID().getText());
    	Expression expr = visit(ctx.expr());
    	AssignExpr assignExpr = new AssignExpr(varName, expr);
    	return assignExpr;
    }
    
    @Override
    public Expression visitVarRef(FeatherweightJavaScriptParser.VarRefContext ctx) {
    	String varName = String.valueOf(ctx.ID().getText());
    	VarExpr varExpr = new VarExpr(varName);
    	return varExpr;
    }
    
    public Expression visitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx) {
    	Expression x = visit(ctx.expr(0));
    	Expression y = visit(ctx.expr(1));
    	Op op = getOperator(String.valueOf(ctx.op.getText()));
    	BinOpExpr binOpExpr = new BinOpExpr(op, x, y);
    	return binOpExpr;
    }
    
    public Expression visitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx) {
    	Expression x = visit(ctx.expr(0));
    	Expression y = visit(ctx.expr(1));
    	Op op = getOperator(String.valueOf(ctx.op.getText()));
    	BinOpExpr binOpExpr = new BinOpExpr(op, x, y);
    	return binOpExpr;
    }
    
    public Expression visitCompare(FeatherweightJavaScriptParser.CompareContext ctx) {
    	Expression x = visit(ctx.expr(0));
    	Expression y = visit(ctx.expr(1));
    	Op op = getOperator(String.valueOf(ctx.op.getText()));
    	BinOpExpr binOpExpr = new BinOpExpr(op, x, y);
    	return binOpExpr;
    }
    
    public Op getOperator(String op) {  	
    	if (op.equals("+")) { return Op.ADD; }

    	else if (op.equals("-")) { return Op.SUBTRACT; }

    	else if (op.equals("*")) { return Op.MULTIPLY; }

    	else if (op.equals("/")) { return Op.DIVIDE; }

    	else if (op.equals("%")) { return Op.MOD; }

    	else if (op.equals(">")) { return Op.GT; }

    	else if (op.equals(">=")) { return Op.GE; }

    	else if (op.equals("<")) { return Op.LT; }

    	else if (op.equals("<=")) { return Op.LE; }

    	else if (op.equals("==")) { return Op.EQ; }

    	else { return null; }
    }

    /**
     * Converts a list of expressions to one sequence expression,
     * if the list contained more than one expression.
     */
    private Expression listToSeqExp(List<Expression> stmts) {
        if (stmts.isEmpty()) return null;
        Expression exp = stmts.get(0);
        for (int i=1; i<stmts.size(); i++) {
            exp = new SeqExpr(exp, stmts.get(i));
        }
        return exp;
    }

    @Override
    public Expression visitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx) {
        return visit(ctx.stat());
    }
}