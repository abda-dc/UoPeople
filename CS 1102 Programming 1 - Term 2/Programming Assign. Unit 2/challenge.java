/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyescount;

/**
 *
 * @author abdelrahman
 */
public class Main {
    public static void main(String[] args) {
        // Roll dice 
        // Count how many times it takes to get snake eyes two ones
        // Run program 1000 times
        // Average the number of times it takes to get snake eyes
        int die1;
        int die2;
        boolean snakeEyes;
        int counter;
        float average;
        int snakeEyeCounter;
        snakeEyeCounter = 0;
        for (int x=0; x<1000; x++) {
        counter = 0;
        snakeEyes = false;
        do { 
            die1 = (int)(Math.random()*6)+1;
            die2 = (int)(Math.random()*6)+1;
            counter+= 1;
            if (die1 == 1 && die2 == 1) {
                snakeEyes = true;
            }
        }  while (!snakeEyes); 
            snakeEyeCounter += counter;
            System.out.println("Snake Eyes after " + counter +" rolls of the dice");
        }
        average = (float)snakeEyeCounter / 1000;
        TextIO.putln("Average of rolls to get snake eyes: " + average);
    }
                
        // Challenge: we will use for loop because we know the number of iterations which is 1000    

}
