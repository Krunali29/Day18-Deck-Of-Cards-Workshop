package com.bridgelabz;

import java.util.Scanner;

public class Players
{
    private String[] playersName;

    public void addingPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of player");
        int p = scan.nextInt();
        playersName = new String[p];
        if(p>4 || p<2)
        {
            System.out.println("Enter player from 2 to 4");
            addingPlayer();
        }
        for(int i=0; i < p; i++) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter the player "  + (i+1) +  " name :");
            String name = scan1.nextLine();
            playersName[i] = name;
        }
    }
    public String[] playerSequence()
    {
        addingPlayer();
        for (int i = 0; i < playersName.length - 1; i++) {

            for (int j = 0; j < playersName.length - i - 1; j++) {
                if (playersName[j].length() > playersName[j+1].length()) {
                    String temp = playersName[j+1];
                    playersName[j] = playersName[j+1];
                    playersName[j+1] = temp;
                }

            }
        }
        return playersName;
    }
}

