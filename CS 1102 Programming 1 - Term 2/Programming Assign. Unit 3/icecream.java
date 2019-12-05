package icecream;

/**
 *
 * @author abdelrahman
 */
public class Icecream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Reading icecream.date
    
        try {
    
            TextIO.readFile("icecream.dat");
    
        }
    
        
        // Print can't open the file, if the file is the wrong path or doesn't exist
           catch (IllegalArgumentException e) {
         System.out.println("Can't open file icecream.dat for reading!");
         System.out.println("Please make sure the file is present before");
         System.out.println("running the program.");
         System.exit(1);  // Terminates the program.
      }
    
         // Counting the total number of ice cream and strawberry cones that were sold
        
        String flavor = "";
        int TotalCones = 0;
        int StrawberryCones = 0;
        
        
        // The percentage of strawberrycones
        double strawPercent = 0.0;
        
        // Reading every line in the icecream.dat
        
        do {
            flavor = TextIO.getln();
            TotalCones += 1;
            if (flavor.equals("Strawberry"))
                StrawberryCones+=1;
            
           // Calculting the percentage of Strawberry Cones
           
            strawPercent = (float)StrawberryCones / TotalCones * 100;
            
        } while (!TextIO.eof());    // Stop reading the file
        
        // Printing total number of cones
        
        System.out.println("Number of Total Cones " + TotalCones);
        
        // Prining total number of strawberry cones
    
        System.out.println("Number of Strawberry Cones " + StrawberryCones);       
    
        // Printing the percentage of total that are strawberry cones using Math Round
        
        System.out.println("Percentage of Total that are Strawberry Cones " +(Math.round(strawPercent)) + "%");
    
    }
    
}
