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
}
