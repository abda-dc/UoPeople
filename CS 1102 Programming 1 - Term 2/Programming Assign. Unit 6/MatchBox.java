/*
 * @author abdelrahman
 */
package main;

// Creating Matchbox class as extends to class Box

public class MatchBox extends Box {

    double weight;
    
// Creating getVolume method for printing the results of width, height and depth and weight
    
     public void getVolume() {
        System.out.println("width of MatchBox is: " + width);
        System.out.println("height of MatchBox is: " + height);
        System.out.println("depth of MatchBox is: " + depth);
        System.out.println("weight of MatchBox is: " + weight);
    }
 
// Calculate weight by multiplying height by width by depth
     
        public double calculateWeight() {
        weight = (width * height * depth) * 03611;
        return weight;
    }
     
 // Calling the constructor using Super keyword
        
    public MatchBox(double w, double h, double d) {
        super(w, h, d);
    }
    
}
