import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseNumber {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // method for reverse a number
    public static void reverseNumber(int number) {
        if (number < 10) {
            // prints the same number if the number is less than 10
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String args[]) throws IOException {
        System.out.print("Enter the number that you want to reverse: ");
        int num = Integer.parseInt(in.readLine());
        System.out.print("The reverse of the given number is: ");
        // method calling
        reverseNumber(num);
    }
}
