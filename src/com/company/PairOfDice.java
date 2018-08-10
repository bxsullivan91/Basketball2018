package com.company;

public class PairOfDice
{
    private Dice dieOne;
    private Dice dieTwo;

    public PairOfDice()
    {
        this.dieOne = new Dice();
        this.dieTwo = new Dice();
    }

    public void roll()
    {
        dieOne.roll();
        dieTwo.roll();
    }

    public int dieTotalValue()
    {
        return dieOne.getValue() + dieTwo.getValue();
    }

}
