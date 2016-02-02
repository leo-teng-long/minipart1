/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import mini.analysis.*;

@SuppressWarnings("nls")
public final class ALoopStmt extends PStmt
{
    private PLoop _loop_;

    public ALoopStmt()
    {
        // Constructor
    }

    public ALoopStmt(
        @SuppressWarnings("hiding") PLoop _loop_)
    {
        // Constructor
        setLoop(_loop_);

    }

    @Override
    public Object clone()
    {
        return new ALoopStmt(
            cloneNode(this._loop_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALoopStmt(this);
    }

    public PLoop getLoop()
    {
        return this._loop_;
    }

    public void setLoop(PLoop node)
    {
        if(this._loop_ != null)
        {
            this._loop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._loop_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._loop_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._loop_ == child)
        {
            this._loop_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._loop_ == oldChild)
        {
            setLoop((PLoop) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
