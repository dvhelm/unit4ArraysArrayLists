import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class ArrayListPractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        System.out.println(" Enter word or 'quit' to stop: ");
        String word = s.next();
        while( words.equals("quit") == false)
        {
            words.add(word);
            word = s.next();
        }

        System.out.println(words);
        for (int i = words.size()-1;i>=0;i--)
        {
            word = words.get(i);
            if( word.equals("like"))
            {
                words.remove(i);
                
            }
        }
        
        System.out.println(words);
    }
}
