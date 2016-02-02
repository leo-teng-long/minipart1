/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.analysis;

import java.util.*;
import mini.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgramProg(AProgramProg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclareDecl(ADeclareDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatType(AFloatType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignStmt(AAssignStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfelseStmt(AIfelseStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALoopStmt(ALoopStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInputStmt(AInputStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOutputStmt(AOutputStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignAssign(AAssignAssign node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfIfelse(AIfIfelse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfelseIfelse(AIfelseIfelse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileLoop(AWhileLoop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReadInput(AReadInput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrintOutput(APrintOutput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlutExpr(APlutExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusExpr(AMinusExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorExpr(AFactorExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplyFactor(AMultiplyFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivideFactor(ADivideFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParenTerm(AParenTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnaryTerm(AUnaryTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdTerm(AIdTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTerm(AIntTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatTerm(AFloatTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringTerm(AStringTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDone(TDone node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndif(TEndif node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRead(TRead node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMul(TMul node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCol(TCol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntconst(TIntconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloatconst(TFloatconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringconst(TStringconst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
