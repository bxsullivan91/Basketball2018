package com.company;

public class PlayerPeg
{
    private int START_POSITION = 0;
    private int position;
    private String name;

    public PlayerPeg(String name)
    {
        this.position = START_POSITION;
        this.name = name;
    }

    public int getPosition()
    {
        return position;
    }

    public String getName()
    {
        return name;
    }


    public void moveForwardOne()
    {
        this.position++;
    }

    public void moveForwardTwo()
    {
        this.position += 2;
    }

    public void moveForwardThree()
    {
        this.position += 3;
    }


}

