/* This file was generated by SableCC (http://www.sablecc.org/). */

package mini.node;

import mini.analysis.*;

@SuppressWarnings("nls")
public final class TMinus extends Token
{
    public TMinus()
    {
        super.setText("-");
    }

    public TMinus(int line, int pos)
    {
        super.setText("-");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMinus(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMinus(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMinus text.");
    }
}
