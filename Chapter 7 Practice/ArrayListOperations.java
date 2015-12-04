import java.util.ArrayList;

/**
 * Write a description of class ArrayListOperations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListOperations
{
    public static void main(String[] args)
    {
        ArrayList<String> names =new ArrayList<String>();
        //a
        System.out.println(names);
        String[] name = {"Alice","Bob","Connie","David","Edward","Fran","Gomez","Harry"};
        for (int i=0;i<name.length;i++)
        {
            names.add(name[i]);
        }
        System.out.println(names);
        //b
        System.out.println(names.get(0));
        System.out.println(names.get(7));
        //c
        System.out.println(names.size());
        //d
        System.out.println(names.get(names.size()-1));
        //e
        names.set(0,"Alice B. Toklas");
        System.out.println(names);
        //f
        names.add(3,"Doug");
        System.out.println(names);
        //g
        //???
        //h
        //???
        //i
        names.remove(0);
        System.out.println(names);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}