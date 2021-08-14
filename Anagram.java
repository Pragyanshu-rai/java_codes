import java.io.*;
import java.util.Vector;

class CheckAnagram {
    public String anagramCheck(String string1, String string2) {
        if (string1.length() != string2.length())
            return "no";
        Vector<Character> letters = new Vector<Character>();
        for (int index = 0; index < string1.length(); index++) {
            letters.add(string1.charAt(index));
        }
        for (int index = 0; index < string2.length(); index++) {
            // System.out.println(string2.charAt(index));
            if(letters.isEmpty()){
                return "no";
            }
            if (letters.contains(string2.charAt(index))) {
                letters.remove(Character.valueOf(string2.charAt(index)));
            } else {
                return "no";
            }
        }

        return (letters.isEmpty()) ? "yes" : "no";
    }
}

public class Anagram {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s1 = new String(), s2 = new String();
        CheckAnagram an = new CheckAnagram();
        s1 = in.readLine();
        s2 = in.readLine();
        System.out.println(an.anagramCheck(s1, s2));
    }
}