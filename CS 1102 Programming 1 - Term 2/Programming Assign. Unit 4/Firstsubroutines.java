/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutines;

/**
 *
 * @author abdelrahman
 */
public class Firstsubroutines {

    /**
     * @param args the command line arguments
     */
        
    // Create a function to get a string and return the reverse value

    static String reverse (String str) {
        
    // Here’s the code for computing the reverse of the string
    
      String reverse;

         int i;

         reverse = "";

         for (i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

  }
     	return (reverse);
   
    
        }
    
    // Create a function that get a string in letters
    
    static String letter(String str) {
        
        String letter;
        int i;
        letter ="";
        
    // I used for loop to remove anything that's not a letter
        
    for (i = 0; i < str.length() ; i++ ) {
        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            letter = letter + str.charAt(i);
        }
    }
        return (letter);
    }
    
    public static void main(String[] args) {

    // Create a program to get inputs from users and return the reverse value
    // Write a main() routine that will read in a string from the user and determine whether or not it is a palindrome.
    
    String userWord,userWordReverse;
    
    // Get the input from the user
    // I included TextIO file with the package so I can use TextIO method function
    TextIO.putln("Could you please enter a word?");
    
    userWord=TextIO.getln();
            
    // Change the input from the user to lower case
    userWord=userWord.toLowerCase();
   
    // Printing the value of letter function
    TextIO.putln("letters: "+letter(userWord));
    
    // Print the reversed value
    TextIO.putln("Reversed: "+reverse(letter(userWord)));

    // Check if the word is a palindrome
    if ((letter(userWord)).equals(reverse(letter(userWord)))){
        TextIO.putln (" This is a palindrome");
    }
    
    else {
        
        TextIO.putln("This is NOT a palindrome");
    }
    
    }
    
}
