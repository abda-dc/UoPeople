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
        int die1;
        int die2;
        // We identify die1 & die2 as integers
        
        boolean snakeEyes;
        // We Identify snakeeyes as boolean
        
        int counter;
        counter = 0;
        // We start counting from 0 and we identify counter as integer
       
        // Snakeeyes starts as false
        snakeEyes = false;
        do { 
            die1 = (int)(Math.random()*6)+1;
            die2 = (int)(Math.random()*6)+1;
            counter+= 1;
            if (die1 == 1 && die2 == 1) {
                snakeEyes = true;
            }
         // I created do loop to roll the dice until snakeeyes is true   
           
        }  while (!snakeEyes); 
            TextIO.putln("Snake Eyes after " + counter +" rolls of the dice");
            
            // This file TextIO.java is for opening a new window with the text or the result
        }
    }
