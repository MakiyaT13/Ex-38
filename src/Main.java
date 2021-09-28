/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] number = new int [20];
    int[] number2 = new int [20];
    int j = 0;

    System.out.print("Enter a list of numbers, separated by spaces: ");
    for (int i = 0; i < 20; i++){
      number[i] =  input.nextInt();
    }
     for (int i = 0; i < 20; i++){
      if (number[i] %2 ==0){
        number2[j] = number[i];
        j++;
      }

    }

    System.out.print("The even numbers are ");
    for (int i = 0; i < 20; i++){
      System.out.println(number2[i]);
    }
}