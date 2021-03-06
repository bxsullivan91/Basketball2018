package com.company;

import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        playGame();
    }

    private static void playGame()
    {
        final int WINNING_SCORE = 21;
        System.out.println("Welcome to the arena!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Player One Name: ");
        PlayerPeg playerOne = new PlayerPeg(input.nextLine());

        System.out.print("Enter Player Two Name: ");
        PlayerPeg playerTwo = new PlayerPeg(input.nextLine());

        PlayerPeg currentPlayer = playerOne;
        boolean gameOver = false;
        PairOfDice dice = new PairOfDice();

        do
        {
            System.out.println("Starting turn for " + currentPlayer.getName() + " at " + currentPlayer.getScore());
            dice.roll();
            System.out.println("Rolled a " + dice.dieTotalValue());


            if (addedPoints(dice.dieTotalValue()) == 1)
            {
                System.out.println("Move One Space!");
                currentPlayer.moveForwardOne();

            }
            else if (addedPoints(dice.dieTotalValue()) == 2)
            {
                System.out.println("Move forward 2 Spaces!");
                currentPlayer.moveForwardTwo();
            }
            else if (addedPoints(dice.dieTotalValue()) == 3)
            {
                System.out.println("Move forward 3 Spaces!!!");
                currentPlayer.moveForwardThree();
            }
            else if (addedPoints(dice.dieTotalValue()) == 0)
            {
                System.out.println("Lose Ball:  Don't Move");
            }

            System.out.println(currentPlayer.getName() +"'s current score is " + currentPlayer.getScore());

            if (currentPlayer.getScore() >= WINNING_SCORE)
            {

                gameOver = true;
            }
            else
            {
                currentPlayer = togglePlayerPeg(playerOne, playerTwo, currentPlayer);

            }

        } while (!gameOver);

        System.out.println(currentPlayer.getName() + " WINS");

    }

    private static int addedPoints(int diceTotal)
    {
        int points = 0;

        if (diceTotal == 5)
        {
            points = 1;
        }
        if (diceTotal == 4 || diceTotal == 6 || diceTotal == 8)
        {
            points = 2;
        }
        if (diceTotal == 2 || diceTotal == 10 || diceTotal == 12)
        {
            points = 3;
        }

        return points;
    }

    private static PlayerPeg togglePlayerPeg(PlayerPeg playerOnePeg, PlayerPeg playerTwoPeg, PlayerPeg currentPlayerPeg)
    {
        PlayerPeg nextPlayer;
        if (currentPlayerPeg == playerOnePeg)
        {
            nextPlayer = playerTwoPeg;
        }
        else
        {
            nextPlayer = playerOnePeg;
        }
        return nextPlayer;

    }
}
