
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
        values = new int[1000];
        for ( this.currentSize = 0; 
        this.currentSize < 6; 
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

    public void replaceNeighbours()
    {
        for (int i=1;i<currentSize-1;i++)
        {
            int minus1 = values[i-1];
            int plus1 = values[i+1];
            if (plus1 > minus1)
            {
                values[i] = plus1;
            }
            else if (minus1 > plus1)
            {
                values[i] = minus1;
            }

        }
    }

    public void replaceMiddle()
    {
        int y = currentSize %2;
        if (  y == 0)
        {
            //for (int x =0;x<2;x++)

            for (int i =(currentSize/2)-1;i<currentSize;i++)
            {
                if ( i == currentSize-1)
                {
                    this.values[i]=0;
                }
                else
                {
                    this.values[i-1]=this.values[i];
                }
            }
            this.currentSize--;

        }
    }

    public void moveEvenFront()
    {
        int[] even = new int[1000];
        int[] odd = new int[1000];
        int x=0;
        int y=0;
        for (int i = 0;i<currentSize;i++)
        {
            if (values[i]%2==0)
            {
                even[x]=values[i];
                x++;
            }
            else
            {
                odd[y] = values[i] ;
                y++;
            }
        }
        for (int i = 0; i<x; i++)
        {
            values[i]=even[i] ;
        }
        for (int i=0; i<y; i++)
        {
            values[i]=odd[i];
        }
    }
}

