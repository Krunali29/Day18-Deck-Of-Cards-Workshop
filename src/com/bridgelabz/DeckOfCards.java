package com.bridgelabz;

public class DeckOfCards extends Players
{
    private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    int n = 4 * 13;

    public String[] deckInitialize()
    {
        String[] deck = new String[this.n];
        for (int i = 0; i < 13; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                deck[4 * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        deck = shuffleCard(deck);
        return deck;
    }
    public String[] shuffleCard(String[] deck)
    {
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }
    int[] nineCardsIndex() {
        int[] cardIndex = { 52, 52, 52, 52, 52, 52, 52, 52, 52 }; //Initialize array with numbers
        int i = 0;
        int min = 0;
        int max = 51;
        while (i < 9) {
            int condition = 0;
            int randomIndex = (int) Math.floor(Math.random() * (max - min) + min);
            for (int j = 0; j < cardIndex.length; j++) {
                if (randomIndex == cardIndex[j]) {
                    condition = 1;
                    break;
                }
            }
            if (condition == 0) {
                cardIndex[i] = randomIndex;
                i += 1;
            }
        }
        return cardIndex;
    }
    public void distribution() {
        String[] player = playerSequence();
        String[] deck = deckInitialize();
        int[] cardIndex = nineCardsIndex();
        System.out.println(cardIndex);
        for (int i = 1; i < player.length + 1; i++) {
            System.out.println("Player " + player[i - 1] + " Cards :");
            for (int j = i - 1; j < cardIndex.length; j = j + player.length) {
                System.out.printf("|| %s    ", deck[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.distribution();
        // String[] deck = deckOfCards.deckInitialize();

    }
}