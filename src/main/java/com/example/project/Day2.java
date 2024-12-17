
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        int len = names.length;
        String[][] naughtyOrNice = new String[2][len];
        int k = 0;
        for(int j = 0; j < len; j ++){
            int random = (int)(Math.random()*2);
            naughtyOrNice[random][j] = names[k];
            k++;
        }
        return naughtyOrNice;
    }

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);
        //Verify that all names are in one of the two lists
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 12; j++){
                System.out.println(result[i][j]);
            }
            System.out.println();
        }
    }
}