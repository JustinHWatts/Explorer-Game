/**
 * TresMatrix.java - Contains methods to work with two-dimensional arrays of objects.
 * 
 * @author Justin Watts
 * @version 13-NOV-2014
 */
public class TresMatrix
{
    public void print(Treasure[][] matrix)
    {
        for (Treasure[] row : matrix)
        {
            for (Treasure treasure : row)
                System.out.print(treasure.toString() + "\n");
            System.out.println();
        }
    }

    public int sum(Treasure[][] matrix)
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
                total += matrix[row][col].getValue();
        }
        
        return total;
    }
    
    public int range(Treasure[][] matrix)
    {
        return this.max(matrix) - this.min(matrix);
    }
    
    public int[] sumRows(Treasure[][] matrix)
    {
        int[] sumTotal = new int[matrix.length];
        int sum = 0;
        
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
                sum += matrix[row][col].getValue();
            sumTotal[row] = sum;
            sum = 0;
        }
        
        return sumTotal;
    }
    
    public boolean isFound(Treasure[][] matrix, Treasure check)
    {
        boolean bool = false;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
                if (matrix[row][col].equals(check))
                    bool = true;
            if (bool)
                break;
        }
        
        return bool;
    }
    
    public int min(Treasure[][] matrix)
    {
        int minVal = 0;
        
        if (matrix.length <= 0)
            minVal = 0;
        else
        {
            for (int row = 0; row < matrix.length; row++)
            {
                for (int col = 0; col < matrix[row].length; col++)
                {
                    if (row == 0 && col == 0)
                        minVal = matrix[row][col].getValue();
                    else if (matrix[row][col].getValue() < minVal)
                        minVal = matrix[row][col].getValue();
                }
            }
        }
        
        return minVal;
    }
    
    public int max(Treasure[][] matrix)
    {
        int maxVal = 0;
        
        if (matrix.length <= 0)
            maxVal = 0;
        else
        {
            for (int row = 0; row < matrix.length; row++)
            {
                for (int col = 0; col < matrix[row].length; col++)
                {
                    if (row == 0 && col == 0)
                        maxVal = matrix[row][col].getValue();
                    else if (matrix[row][col].getValue() > maxVal)
                        maxVal = matrix[row][col].getValue();
                }
            }
        }
        
        return maxVal;
    }
    
    public Treasure[][] reverseRows(Treasure[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length / 2; col++)
            {
                Treasure temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix.length - col - 1];
                matrix[row][matrix.length - col - 1] = temp;
            }
        }
        
        return matrix;
    }
}