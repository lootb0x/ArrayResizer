public class ArrayResizer
{
/** Returns true if and only if every value in row r of array2D is non-zero.
* Precondition: r is a valid row index in array2D.
* Postcondition: array2D is unchanged.
*/
public static boolean isNonZeroRow(int[][] array2D, int r)
{  
    boolean zerorow= true;
    for(int x = 0; x<array2D[x].length; x++ )
    {
        if(array2D[r][x]!= 0) zerorow=false;
    }
    return zerorow;
}
/** Returns the number of rows in array2D that contain all non-zero values.
* Postcondition: array2D is unchanged.
*/
public static int numNonZeroRows(int[][] array2D)
{  boolean nonzerorow= true;
    int count =0;
    for(int x = 0; x<array2D.length; x++ )
    {
        for(int y =0; y<array2D[x].length; y++)
        {
        if(array2D[x][y]== 0) nonzerorow=false;
        }
        if(nonzerorow) count++;
        nonzerorow = true;
    }

    return count;
}
/** Returns a new, possibly smaller, two-dimensional array that contains only rows
* from array2D with no zeros, as described in part (b).
* Precondition: array2D contains at least one column and at least one row with no zeros.
* Postcondition: array2D is unchanged.
*/
public static int[][] resize(int[][] array2D)
{ 
    int[][] tiny = new int[numNonZeroRows(array2D)][array2D[0].length];
    int tinyrow = 0;
    for(int x=0; x<array2D.length; x++)
     { 

            if(ArrayResizer.checknonzero(array2D[x])) 
            {
                
                    for(int y =0; y<tiny[0].length; y++)
                    {

                        tiny[tinyrow][y] = array2D[x][y];
                        System.out.print(tiny[tinyrow][y]+" ");
                
                    }
                    tinyrow++;
            System.out.println();
            }
        }
        return tiny;
    
}

private static boolean checknonzero(int[] arr)
{
    boolean nozeros = true;
    for(int x=0; x<arr.length; x++)
    {
        if(arr[x]==0) nozeros= false;
    }

    return nozeros;
}

}