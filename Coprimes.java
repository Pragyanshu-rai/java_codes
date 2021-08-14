import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoprimeUtil {
    public int getCoprimes(int number) {
        int result = number;

        for (int num = 2; num * num <= number; num++) {
            if (number % num == 0) {
                while (number % num == 0) {
                    number /= num;
                }
                result -= result / num;
            }
        }
        if (number > 1) {
            result -= result / number;
        }
        return result;
    }
}

public class Coprimes {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number;
        CoprimeUtil cp = new CoprimeUtil();
        number = Integer.parseInt(in.readLine());
        System.out.println(cp.getCoprimes(number));
    }
}