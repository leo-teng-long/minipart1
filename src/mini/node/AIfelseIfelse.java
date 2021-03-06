/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import java.util.*;
import mini.analysis.*;

@SuppressWarnings("nls")
public final class AIfelseIfelse extends PIfelse
{
    private TIf _if_;
    private PExpr _expr_;
    private TThen _then_;
    private final LinkedList<PStmt> _thenStmts_ = new LinkedList<PStmt>();
    private TElse _else_;
    private final LinkedList<PStmt> _elseStmts_ = new LinkedList<PStmt>();
    private TEndif _endif_;

    public AIfelseIfelse()
    {
        // Constructor
    }

    public AIfelseIfelse(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TThen _then_,
        @SuppressWarnings("hiding") List<?> _thenStmts_,
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") List<?> _elseStmts_,
        @SuppressWarnings("hiding") TEndif _endif_)
    {
        // Constructor
        setIf(_if_);

        setExpr(_expr_);

        setThen(_then_);

        setThenStmts(_thenStmts_);

        setElse(_else_);

        setElseStmts(_elseStmts_);

        setEndif(_endif_);

    }

    @Override
    public Object clone()
    {
        return new AIfelseIfelse(
            cloneNode(this._if_),
            cloneNode(this._expr_),
            cloneNode(this._then_),
            cloneList(this._thenStmts_),
            cloneNode(this._else_),
            cloneList(this._elseStmts_),
            cloneNode(this._endif_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfelseIfelse(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TThen getThen()
    {
        return this._then_;
    }

    public void setThen(TThen node)
    {
        if(this._then_ != null)
        {
            this._then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._then_ = node;
    }

    public LinkedList<PStmt> getThenStmts()
    {
        return this._thenStmts_;
    }

    public void setThenStmts(List<?> list)
    {
        for(PStmt e : this._thenStmts_)
        {
            e.parent(null);
        }
        this._thenStmts_.clear();

        for(Object obj_e : list)
        {
            PStmt e = (PStmt) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._thenStmts_.add(e);
        }
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    public LinkedList<PStmt> getElseStmts()
    {
        return this._elseStmts_;
    }

    public void setElseStmts(List<?> list)
    {
        for(PStmt e : this._elseStmts_)
        {
            e.parent(null);
        }
        this._elseStmts_.clear();

        for(Object obj_e : list)
        {
            PStmt e = (PStmt) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._elseStmts_.add(e);
        }
    }

    public TEndif getEndif()
    {
        return this._endif_;
    }

    public void setEndif(TEndif node)
    {
        if(this._endif_ != null)
        {
            this._endif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endif_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._expr_)
            + toString(this._then_)
            + toString(this._thenStmts_)
            + toString(this._else_)
            + toString(this._elseStmts_)
            + toString(this._endif_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._then_ == child)
        {
            this._then_ = null;
            return;
        }

        if(this._thenStmts_.remove(child))
        {
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._elseStmts_.remove(child))
        {
            return;
        }

        if(this._endif_ == child)
        {
            this._endif_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._then_ == oldChild)
        {
            setThen((TThen) newChild);
            return;
        }

        for(ListIterator<PStmt> i = this._thenStmts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStmt) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        for(ListIterator<PStmt> i = this._elseStmts_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStmt) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._endif_ == oldChild)
        {
            setEndif((TEndif) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
