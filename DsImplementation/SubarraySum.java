package DsImplementation;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class ArrayUtils {

    public final List<Integer> array;

    public ArrayUtils() {
        this.array = new ArrayList<Integer>();
    }

    public ArrayUtils(int[] list) {

        // calling the default constructor
        this();

        for (int element : list) {
            this.array.add(element);
        }

    }

    public boolean subarraySum(int target) {
        /**
         * Returns true if the array contains the subarray of the given target sum.
         */

        int start = 0, end = 1, limit = this.array.size(), currentSum = this.array.get(start), sumSoFar = currentSum;

        while (end < limit) {

            if (currentSum == target) {
                return true;
            }

            sumSoFar = (currentSum + this.array.get(end));

            if (sumSoFar > target) {
                currentSum -= this.array.get(start);
                start++;
            }

            else {
                currentSum += this.array.get(end);
                end++;
            }

            // Debug
            System.out.println(sumSoFar + ", " + start + ", " + end);
        }
        return false;
    }
}

public class SubarraySum {

    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final ArrayUtils arrayUtils = new ArrayUtils();

    public static void main(String[] args) throws IOException {

        int size, target;
        size = Integer.valueOf(in.readLine().strip());

        for (int index = 0; index < size; index++) {
            arrayUtils.array.add(Integer.valueOf(in.readLine().strip()));
        }

        target = Integer.valueOf(in.read());

        System.out.println(arrayUtils.subarraySum(target));
    }
}