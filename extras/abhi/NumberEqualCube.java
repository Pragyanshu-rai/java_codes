class NumberEqualCubeUtil {

    /**
     * This method when provided with a base an a power raises 
     * the base to that power.
     * @param base
     * @param power
     * @return
     */
    private int raiseToThePower(int base, int power) {
        int result = 1;
        for (; power > 0; power--) {
            result *= base;
        }
        return result;
    }

    /**
     * This method will return true if a number is a number
     * equal cube else it will return false
     * @param number
     * @return
     */
    private boolean isNumberEqualCube(int number) {
        String targetNumber = Integer.toString(number);
        int power = targetNumber.length();
        int result = 0;

        for (int index = 0; index < targetNumber.length(); index++) {
            result += raiseToThePower((targetNumber.charAt(index) - '0'), power);
        }

        if (result == number) {
            return true;
        }
        return false;
    }

    /**
     * This method is used to display the result
     * @param number
     */
    private void printResults(int number) {
        System.out.println(number + " is a NumberEqualCube");
    }

    /**
     * This method will print all the numbers in the given range
     * that are number equal cube
     * @param start
     * @param end
     */
    public void getNumberEqualCubeInRange(int start, int end) {
        for (int current = start; current <= end; current++) {
            if (this.isNumberEqualCube(current)) {
                this.printResults(current);
            }
        }
    };
}

public class NumberEqualCube {
    public static void main(String[] args) {

        NumberEqualCubeUtil necu = new NumberEqualCubeUtil();
        necu.getNumberEqualCubeInRange(1, 100000);
    }
}