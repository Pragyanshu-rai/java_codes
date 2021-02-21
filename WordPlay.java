import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class WordPlay
{
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static boolean isVowel(char letter)
    {
        if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')
            return true;
        return false;    
    }
    public static String replaceVowels(String line, char key)
    {
        StringBuilder newLine = new StringBuilder("");
        for(int index=0; index<line.length(); index++)
        {
            if(isVowel(line.charAt(index)))
                newLine.append(key);
            else
                newLine.append(line.charAt(index));
        }
        return newLine.toString();
    }
    public static String emphasize(String line, char key)
    {
        StringBuilder newLine = new StringBuilder("");
        for(int index=0; index<line.length(); index++)
        {
            if(line.charAt(index) == key || line.charAt(index) == Character.toUpperCase(key))
            {
                if(index%2==0)
                    newLine.append('*');
                if(index%2==1)
                    newLine.append('+');
            }
            else
                newLine.append(line.charAt(index));    
        }
        return newLine.toString();
    }
    public static void main(String args[]) throws IOException
    {
        String input;
        char key;
        System.out.print("Enter the string :- ");
        input = in.readLine();
        System.out.print("Enter the key :- ");
        key = (char)in.read();
        System.out.println("The string is :- "+replaceVowels(input, key));
        System.out.println("The string is :- "+emphasize(input, key));
    }
}
