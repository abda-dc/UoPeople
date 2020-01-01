/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7;

/**
 *
 * @author abdelrahman
 */
public class Unit7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        // Setting the numbers of Rows & Columns
        
        int numberOfRows = 2;
        int numberOfColumns = 3;
        
        // Creating the matrix
        
        int[][] m   =  new  int[][] {  {10,12,11}, {9,8,31}, {2,16,24} };
        
        // Intializing the results variable 
        
        int result =  0;
        
        
        if (numberOfRows == numberOfColumns) {
            
         // Creating for loop to calculate the sum of the Secondary Diagonal
            
            for (int rowIndex =  0;  rowIndex <  m.length;  rowIndex++) {
                int columnIndex =  m.length  - (rowIndex  +  1);
                result +=  m[rowIndex][columnIndex];
            } 
            System.out.println(result);
        }
        else {
            System.out.println("This is not a square matrix");
        }
    }
}
