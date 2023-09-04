class CoinsUtil {

    private int[] currentCoins;
    private int[] toPay;

    public CoinsUtil(int[] currentCoins, int[] toPay) {
        this.currentCoins = currentCoins;
        this.toPay = toPay;
    }

    /**
     * This method when invoked with a targetAmount will return the maximum number of
     * coins to be added so that it becomes the same as the targetAmount
     * @param target
     * @return
     */
    private int[] countChange(int target) {
        int target_index = -1;
        int[] result;
        int start_index = -1;
        int max_count = 0;

        for (int i = 0; i < this.currentCoins.length; i++) {
            start_index = i;
            if (this.currentCoins[i] > target) {
                start_index -= 1;
                break;
            }
        }

        if (start_index != -1) {

            for (int i = start_index; i >= 0; i--) {
                int start = this.currentCoins[i];
                int currentTarget = target - start;
                int currentCount = 1;

                for (int j = i - 1; j >= 0; j--) {
                    if (this.currentCoins[j] <= currentTarget) {
                        currentTarget -= this.currentCoins[j];
                        currentCount++;
                    }

                    if (currentTarget == 0) {
                        break;
                    }
                }

                if (currentCount > max_count && currentTarget == 0) {
                    max_count = currentCount;
                    target_index = i;
                }
            }

            result = new int[max_count];

            for (int i = 0; i < result.length;) {
                int currentTarget = target;

                for (int j = target_index; j >= 0; j--) {
                    if (this.currentCoins[j] <= currentTarget) {
                        currentTarget -= this.currentCoins[j];
                        result[i++] = this.currentCoins[j];
                    }

                    if (currentTarget == 0) {
                        break;
                    }
                }
            }

            return result;
        }
        return new int[0];
    }

    /**
     * This method when invoked will return a 2D array that stores all the
     * change for the respective amount
     * @return
     */
    private int[][] countChangeForALl() {
        int[][] result = new int[this.toPay.length][];

        for (int i = 0; i < this.toPay.length; i++) {
            result[i] = this.countChange(this.toPay[i]);
        }

        return result;
    }

    /**
     * This method when invoked will print all the change in the array.
     */
    public void printChange() {
        int[][] result = this.countChangeForALl();

        for (int i = 0; i < result.length; i++) {

            System.out.print(this.toPay[i] + " cents:\t");
            if (result[i].length > 0) {
                System.out.print("Yes; used coins - ");
                for (int value : result[i]) {
                    System.out.print(value + " cents ");
                }
            } else {
                System.out.print("No; Cannot be paid with the current coins");
            }
            System.out.println();
        }
    }
}

public class Coins {
    public static void main(String[] args) {
        int[] coins = { 1, 4, 4, 5, 8 };
        int[] toPay = { 9, 6, 4, 7, 8 };
        CoinsUtil cu = new CoinsUtil(coins, toPay);
        cu.printChange();
    }
}
