
/**
 * Write a description of class ArrayOperationsSolo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOperationsSolo
{
    private int[] values;
    private int currentSize;
    public ArrayOperationsSolo()
    {
        values = new int[5];
        for ( this.currentSize = 0; 
        this.currentSize < 5; 
        this.currentSize++)
        {
            this.values[this.currentSize] = this.currentSize*this.currentSize;
        }
    }

    public void swapFirstLast()
    {
        int first = this.values[0];
        values[0] = values[4];
        values[4] = first;
    }

    public void swapRight()
    {
        for (int x = 0;x<currentSize-1;x++)
        {
            for (int i = 1;i<currentSize;i++)
            {
                if (i==4)
                {
                    int temp1 = values[i];
                    int temp2 = values[0];
                    values[i] = temp2;
                    values[0] = temp1;
                }
                else
                {
                    int temp1 = values [i];
                    int temp2 = values [i+1];
                    values[i] = temp2;
                    values[i+1] = temp1;
                }
            }
        }
    }
    
    public void replaceEvens()
    {
        for (int i = 0;i<currentSize;i++)
        {
            if (values[i]%2==0)
            {
                values[i] = 0 ;
            }
        }
    }
}

