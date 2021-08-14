import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheckPalindrome {
    public int checkPal(String target){
        for(int index=0; index<target.length()/2; index++){
            if(target.charAt(index) != target.charAt(target.length()-index-1)){
                return 0;
            }
        }
        return 1;
    }
}

public class Palindrome {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String target = new String();
        CheckPalindrome cp = new CheckPalindrome();
        target = in.readLine();
        System.out.println(cp.checkPal(target));
    }
}
