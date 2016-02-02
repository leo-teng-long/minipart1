/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.analysis;

import java.util.*;
import mini.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProg().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgramProg(AProgramProg node)
    {
        defaultIn(node);
    }

    public void outAProgramProg(AProgramProg node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgramProg(AProgramProg node)
    {
        inAProgramProg(node);
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        outAProgramProg(node);
    }

    public void inADeclareDecl(ADeclareDecl node)
    {
        defaultIn(node);
    }

    public void outADeclareDecl(ADeclareDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclareDecl(ADeclareDecl node)
    {
        inADeclareDecl(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getCol() != null)
        {
            node.getCol().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outADeclareDecl(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inAFloatType(AFloatType node)
    {
        defaultIn(node);
    }

    public void outAFloatType(AFloatType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatType(AFloatType node)
    {
        inAFloatType(node);
        if(node.getFloat() != null)
        {
            node.getFloat().apply(this);
        }
        outAFloatType(node);
    }

    public void inAStringType(AStringType node)
    {
        defaultIn(node);
    }

    public void outAStringType(AStringType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        inAStringType(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringType(node);
    }

    public void inAAssignStmt(AAssignStmt node)
    {
        defaultIn(node);
    }

    public void outAAssignStmt(AAssignStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignStmt(AAssignStmt node)
    {
        inAAssignStmt(node);
        if(node.getAssign() != null)
        {
            node.getAssign().apply(this);
        }
        outAAssignStmt(node);
    }

    public void inAIfelseStmt(AIfelseStmt node)
    {
        defaultIn(node);
    }

    public void outAIfelseStmt(AIfelseStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfelseStmt(AIfelseStmt node)
    {
        inAIfelseStmt(node);
        if(node.getIfelse() != null)
        {
            node.getIfelse().apply(this);
        }
        outAIfelseStmt(node);
    }

    public void inALoopStmt(ALoopStmt node)
    {
        defaultIn(node);
    }

    public void outALoopStmt(ALoopStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALoopStmt(ALoopStmt node)
    {
        inALoopStmt(node);
        if(node.getLoop() != null)
        {
            node.getLoop().apply(this);
        }
        outALoopStmt(node);
    }

    public void inAInputStmt(AInputStmt node)
    {
        defaultIn(node);
    }

    public void outAInputStmt(AInputStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInputStmt(AInputStmt node)
    {
        inAInputStmt(node);
        if(node.getInput() != null)
        {
            node.getInput().apply(this);
        }
        outAInputStmt(node);
    }

    public void inAOutputStmt(AOutputStmt node)
    {
        defaultIn(node);
    }

    public void outAOutputStmt(AOutputStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOutputStmt(AOutputStmt node)
    {
        inAOutputStmt(node);
        if(node.getOutput() != null)
        {
            node.getOutput().apply(this);
        }
        outAOutputStmt(node);
    }

    public void inAAssignAssign(AAssignAssign node)
    {
        defaultIn(node);
    }

    public void outAAssignAssign(AAssignAssign node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignAssign(AAssignAssign node)
    {
        inAAssignAssign(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAAssignAssign(node);
    }

    public void inAIfIfelse(AIfIfelse node)
    {
        defaultIn(node);
    }

    public void outAIfIfelse(AIfIfelse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfIfelse(AIfIfelse node)
    {
        inAIfIfelse(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEndif() != null)
        {
            node.getEndif().apply(this);
        }
        outAIfIfelse(node);
    }

    public void inAIfelseIfelse(AIfelseIfelse node)
    {
        defaultIn(node);
    }

    public void outAIfelseIfelse(AIfelseIfelse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfelseIfelse(AIfelseIfelse node)
    {
        inAIfelseIfelse(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getThenStmts());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getElseStmts());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEndif() != null)
        {
            node.getEndif().apply(this);
        }
        outAIfelseIfelse(node);
    }

    public void inAWhileLoop(AWhileLoop node)
    {
        defaultIn(node);
    }

    public void outAWhileLoop(AWhileLoop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileLoop(AWhileLoop node)
    {
        inAWhileLoop(node);
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        {
            List<PStmt> copy = new ArrayList<PStmt>(node.getStmt());
            for(PStmt e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDone() != null)
        {
            node.getDone().apply(this);
        }
        outAWhileLoop(node);
    }

    public void inAReadInput(AReadInput node)
    {
        defaultIn(node);
    }

    public void outAReadInput(AReadInput node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadInput(AReadInput node)
    {
        inAReadInput(node);
        if(node.getRead() != null)
        {
            node.getRead().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAReadInput(node);
    }

    public void inAPrintOutput(APrintOutput node)
    {
        defaultIn(node);
    }

    public void outAPrintOutput(APrintOutput node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintOutput(APrintOutput node)
    {
        inAPrintOutput(node);
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAPrintOutput(node);
    }

    public void inAPlutExpr(APlutExpr node)
    {
        defaultIn(node);
    }

    public void outAPlutExpr(APlutExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlutExpr(APlutExpr node)
    {
        inAPlutExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAPlutExpr(node);
    }

    public void inAMinusExpr(AMinusExpr node)
    {
        defaultIn(node);
    }

    public void outAMinusExpr(AMinusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpr(AMinusExpr node)
    {
        inAMinusExpr(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAMinusExpr(node);
    }

    public void inAFactorExpr(AFactorExpr node)
    {
        defaultIn(node);
    }

    public void outAFactorExpr(AFactorExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorExpr(AFactorExpr node)
    {
        inAFactorExpr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactorExpr(node);
    }

    public void inAMultiplyFactor(AMultiplyFactor node)
    {
        defaultIn(node);
    }

    public void outAMultiplyFactor(AMultiplyFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplyFactor(AMultiplyFactor node)
    {
        inAMultiplyFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMul() != null)
        {
            node.getMul().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAMultiplyFactor(node);
    }

    public void inADivideFactor(ADivideFactor node)
    {
        defaultIn(node);
    }

    public void outADivideFactor(ADivideFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivideFactor(ADivideFactor node)
    {
        inADivideFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outADivideFactor(node);
    }

    public void inATermFactor(ATermFactor node)
    {
        defaultIn(node);
    }

    public void outATermFactor(ATermFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        inATermFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermFactor(node);
    }

    public void inAParenTerm(AParenTerm node)
    {
        defaultIn(node);
    }

    public void outAParenTerm(AParenTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenTerm(AParenTerm node)
    {
        inAParenTerm(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAParenTerm(node);
    }

    public void inAUnaryTerm(AUnaryTerm node)
    {
        defaultIn(node);
    }

    public void outAUnaryTerm(AUnaryTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnaryTerm(AUnaryTerm node)
    {
        inAUnaryTerm(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAUnaryTerm(node);
    }

    public void inAIdTerm(AIdTerm node)
    {
        defaultIn(node);
    }

    public void outAIdTerm(AIdTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdTerm(AIdTerm node)
    {
        inAIdTerm(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdTerm(node);
    }

    public void inAIntTerm(AIntTerm node)
    {
        defaultIn(node);
    }

    public void outAIntTerm(AIntTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTerm(AIntTerm node)
    {
        inAIntTerm(node);
        if(node.getIntconst() != null)
        {
            node.getIntconst().apply(this);
        }
        outAIntTerm(node);
    }

    public void inAFloatTerm(AFloatTerm node)
    {
        defaultIn(node);
    }

    public void outAFloatTerm(AFloatTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatTerm(AFloatTerm node)
    {
        inAFloatTerm(node);
        if(node.getFloatconst() != null)
        {
            node.getFloatconst().apply(this);
        }
        outAFloatTerm(node);
    }

    public void inAStringTerm(AStringTerm node)
    {
        defaultIn(node);
    }

    public void outAStringTerm(AStringTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringTerm(AStringTerm node)
    {
        inAStringTerm(node);
        if(node.getStringconst() != null)
        {
            node.getStringconst().apply(this);
        }
        outAStringTerm(node);
    }
}
