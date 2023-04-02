package controller;

import br.fatec.StackInt.StackInt;

public class ConversorController
{
    public ConversorController()
    {
        super();
    }

    public String dec2Bin(int dec)
    {
        StackInt p = new StackInt();
        StringBuilder bin = new StringBuilder();

        while (dec != 0)
        {
            p.push(dec % 2);
            dec /= 2;
        }
        while (!p.isEmpty())
        {
            bin.append(p.top());
            p.pop();
        }
        return bin.toString();
    }
}
