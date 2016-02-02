/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import mini.analysis.*;

@SuppressWarnings("nls")
public final class TCol extends Token
{
    public TCol()
    {
        super.setText(":");
    }

    public TCol(int line, int pos)
    {
        super.setText(":");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCol(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCol(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCol text.");
    }
}
