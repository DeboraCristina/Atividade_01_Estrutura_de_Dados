package controller;

import br.fatec.StackInt.StackInt;

public class FatorialControler
{
    public FatorialControler()
    {
        super();
    }

    public int fatorial(int val)
    {
        StackInt p = new StackInt();
        int v;

        while (val > 0)
        {
            if (p.size() < 2)
                p.push(val);
            else
            {
                v = p.pop() * p.pop();
                p.push(val);
                p.push(v);
            }
            val--;
        }
        return p.top();
    }
}
