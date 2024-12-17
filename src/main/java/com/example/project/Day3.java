package com.example.project;

public class Day3 {
  private static int sizeM = 5;
  public static String[][] generateSnowflake(int size) { //you will be tested on this method
    String[][] grid = new String[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
          grid[i][j] = " ";
      }
    }
    int middle = size/2;
    for(int i = 0; i < size; i++){
      grid[i][middle] = "*";
      grid[middle][i] = "*";
      grid[i][i] = "*";
      grid[i][size - 1 - i] = "*";
    }
    return grid;
  }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
  public static void printSnowflake(String[][] snowflake) {
    for(int i = 0; i < sizeM; i++){
      for(int j = 0; j < sizeM; j++){
        System.out.print(snowflake[i][j]);
      }
      System.out.println();
    }
  }

    // Test for the snowflake generation
  public static void main(String[] args) {
    printSnowflake(generateSnowflake(sizeM));
  }
}
