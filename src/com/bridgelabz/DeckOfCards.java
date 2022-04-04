package com.bridgelabz;

import java.util.Random;

public class DeckOfCards
{
    private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    int n = suits.length * ranks.length;

    String[] deckInitialize()
    {
        String[] deck = new String[this.n];
        for (int i = 0; i < ranks.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        for (int i = 0; i < n; i++)
        {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public static void main(String[] args)
    {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.deckInitialize();
    }
}