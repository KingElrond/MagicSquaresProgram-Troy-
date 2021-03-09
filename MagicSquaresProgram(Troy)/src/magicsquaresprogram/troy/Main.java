/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquaresprogram.troy;

/**
 *
 * @author troyd
 */
public class Main {

	
	public static int[][] squareArr = {
			{2,7,6},
			{9,5,1},
			{4,3,8},
	};
	
	
	
	static int[] sumOfEachRow(int[][] square)
	{
		int[] rowsums = new int[square.length];
		
		for(int row=0; row<square.length; row++){
            for(int col=0; col<square[row].length;col++){
                int columnValue = square[row][col];
                rowsums[row] = rowsums[row] + columnValue;
            }
		}
		return rowsums;
	}
	
	
	static int[] getColumn(int[][] square)
	{
		return null;
		
	}
	
	
	static int[] sumOfEachColumn(int[][] square, int c)
	{
		return null;
		
	}
	
	
	static int sumOfDescendingDiagonal(int[][] square)
	{
		return 0;
		
	}
	
	
	static int sumOfAscendingDiagonal(int[][] square)
	{
		return 0;
		
	}
	
	
	static boolean isMagicSquare(int[] rowSum, int[] colSum, int ascendingDiagonal, int descendingDiagonal)
	{
		return false;
		
	}
	
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	sumOfEachRow(squareArr);
    	
    	
    	
    }
    
}
