import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class BracesUtil {
    public String checkCode(String code) {
        Stack<Character> balance = new Stack<Character>();
        for(int index=0; index<code.length(); index++){
            if(code.charAt(index) == '{'){
                balance.push(code.charAt(index));
            }
            else if(code.charAt(index) == '}'){
                if(balance.isEmpty()){
                    return "error";
                }
                balance.pop();
            }
        }
        return (balance.isEmpty()) ? "correct" : "error";
    }
}

public class MissingBraces {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String code;
        code = in.readLine();
        BracesUtil cp = new BracesUtil();
        System.out.println(cp.checkCode(code));
    }
}