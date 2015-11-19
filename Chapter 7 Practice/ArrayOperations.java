public class ArrayOperations
{
    public static void arrays()
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("b.) X Length : "+x.length);
        System.out.println("c.) X [0] : "+x[0]);
        System.out.println("d.) X [8} : "+x[8]);
        System.out.println("e.) X [x.length-1] : "+x[x.length-1]);
        System.out.println("f.) X [all]: ");
        for (int i=0;i<9;i++)
        {
            System.out.println(x[i]);
        }
        System.out.println("g.) X [all]: ");
        for (int i=0;i<9;i++)
        {
            System.out.println("X"+i+" : "+x[i]);
        }
        System.out.println("h.) X [all reversed]: ");
        for (int i=8;i>=0;i--)
        {
            System.out.println("X"+i+" : "+x[i]);
        }
    }
}