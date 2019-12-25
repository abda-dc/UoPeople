/*
 * @author abdelrahman
 */
package main;

// Creat MatchBox object and calls getVolume

public class Main {

  public static void main(String[] args) {
      
// Creating Matchbox object

    MatchBox matchbox = new MatchBox(5, 10, 3);

// Calculating the weight of the Match Box
    matchbox.calculateWeight();

// Calling getVolume method and Identifying width, height and depth of the MatchBox
    
    matchbox.getVolume();
    Box box = new Box(5, 10, 3);
    box.getVolume();
    
  }
}
