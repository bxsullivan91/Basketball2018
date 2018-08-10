package com.company;

public class PlayerPeg
{

    private int score;
    private String name;

    public PlayerPeg(String name)
    {
        this.score = 0;
        this.name = name;
    }

    public int getScore()
    {
        return score;
    }

    public String getName()
    {
        return name;
    }


    public void moveForwardOne()
    {
        this.score++;
    }

    public void moveForwardTwo()
    {
        this.score += 2;
    }

    public void moveForwardThree()
    {
        this.score += 3;
    }


}

