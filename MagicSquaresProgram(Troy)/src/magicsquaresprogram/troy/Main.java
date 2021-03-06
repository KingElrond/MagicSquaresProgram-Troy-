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
			{1,15,14,4},
			{10,11,8,5},
			{7,6,9,12},
			{16,2,3,13},
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
	
	
	static int[] getColumn(int[][] square, int c)
	{
		//What is this for?
		int[] column = new int[square.length];
		
		for(int row=0; row<square.length; row++)
		{
			int colVal=square[row][c];
			column[row]=colVal;
		}
		
		return column;
		
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
		boolean rowsEqual = true, colsEqual = true, rowcolEqual=true, diagrowEqual=true, diagEqual=true, allEqual = false;
		for(int g: rowSum)
		{
			for(int g2: rowSum)
			{
				if(g!=g2)
				{
					rowsEqual=false;
				}
			}
		}
		
		for(int g: colSum)
		{
			for(int g2: colSum)
			{
				if(g!=g2)
				{
					colsEqual=false;
				}
			}
		}
		
		for(int g: colSum)
		{
			for(int g2: rowSum)
			{
				if(g!=g2)
				{
					rowcolEqual=false;
				}
			}
		}
		
		for(int g: rowSum)
		{
			for(int g2: rowSum)
			{
				if(g!=g2)
				{
					rowsEqual=false;
				}
			}
		}
		if(descendingDiagonal!=ascendingDiagonal)
		{
			diagEqual=false;
		}
		
		for(int g: rowSum)
		{
			int g2=descendingDiagonal;
				if(g!=g2)
				{
					diagrowEqual=false;
				}
		}
		
		if(rowsEqual&&colsEqual&&rowcolEqual&&diagEqual&&diagrowEqual)
		{
			allEqual=true;
		}
		
		return allEqual;
		
	}
	
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	System.out.println("Square is: " + squareArr.length + "x" + squareArr.length);
    	System.out.println("Rowsums: ");
    	int[] rowsum=sumOfEachRow(squareArr);
        for(int g : rowsum)
        {
            System.out.println(g);
        }
        System.out.println("Column sums: ");
    	int[] colsum=sumOfEachColumn(squareArr,0);
        for(int g : colsum)
        {
            System.out.println(g);
        }
        int aDsum = sumOfAscendingDiagonal(squareArr);
        int dDsum = sumOfDescendingDiagonal(squareArr);
        System.out.println("Descending Diagonal Sum: " + dDsum);
        System.out.println("Ascending Diagonal Sum: " + aDsum);
        
    	boolean isMcSq = isMagicSquare(rowsum,colsum,aDsum,dDsum);
    	
    	System.out.println("Is the Square a Magic Square: \n" + isMcSq);
    	
    }
    
}
