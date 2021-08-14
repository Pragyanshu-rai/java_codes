import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringUtil {
    public String contains(String target, String test) {
        int char_match = 0;
        for (int index = 0; index < target.length(); index++) {
            if (char_match == test.length() - 1) {
                return "Yes";
            }
            if (target.charAt(index) == test.charAt(char_match)) {
                char_match++;
            } else {
                char_match = 0;
            }
        }
        return (char_match == test.length() - 1) ? "yes" : "no";
    }
}

public class WithinString {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String target, test;
        StringUtil cp = new StringUtil();
        target = in.readLine();
        test = in.readLine();
        System.out.println(cp.contains(target, test));
    }
}