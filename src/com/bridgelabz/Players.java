package com.bridgelabz;

import java.util.Scanner;

public class Players
{
    private String[] playersName = new String[4];

    public void addingPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of player");
        int p = scan.nextInt();
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
    public void playerSequence()
    {
        for(int i=0; i < playersName.length; i++)
        {
            if(playersName[i] == null) {
                break;
            }
            for(int j = 0; j < playersName.length; j++)
            {
                if(playersName[j] == null)
                {
                    continue;
                }
                if(playersName[i].hashCode() != playersName.hashCode()) {
                    if(playersName[i].length() > playersName[j].length()) {
                        String temp = playersName[j];
                        playersName[j] = playersName[i];
                        playersName[i] = temp;
                    }
                }
            }
        }

    }

}
