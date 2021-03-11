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
			{1,1,6},
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
            int[] colsums = new int[square.length];
		
            for(int col=0; col<square.length;col++){
		for(int row=0; row<square.length; row++){
                int rowValue = square[row][col];
                colsums[col] = colsums[col] + rowValue;
            }
		}
                
                
		return colsums;
		
	}
	
	
	static int sumOfDescendingDiagonal(int[][] square)
	{
		int dDiagsums = 0;
		
        for(int diag=0; diag<square.length;diag++){
            int dDiagValue = square[diag][diag];
            dDiagsums = dDiagsums + dDiagValue;
	
        }
		return dDiagsums;
		
	}
	
	
	static int sumOfAscendingDiagonal(int[][] square)
	{
		int aDiagsums = 0;
		int diag2=square.length-1;
		while(diag2!=-1)
		{
        for(int diag=0; diag<square.length;diag++){
            int aDiagValue = square[diag][diag2];
            aDiagsums = aDiagsums + aDiagValue;
            diag2--;
        }
        
		}
		return aDiagsums;
		
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
    	int[] rowsum=sumOfEachRow(squareArr);
        for(int g : rowsum)
        {
            System.out.println(g);
        }
    	int[] colsum=sumOfEachColumn(squareArr,0);
        for(int g : colsum)
        {
            System.out.println(g);
        }
    	
        int aDsum = sumOfAscendingDiagonal(squareArr);
        int dDsum = sumOfDescendingDiagonal(squareArr);
        System.out.println(dDsum);
        System.out.println(aDsum);
        
    	
    }
    
}
