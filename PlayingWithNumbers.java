import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NumbersUtil {
    public int[] rotateArray(int size, int[] array, int rotate) {
        /* 
        * To rotate the elements position in the array by the value rotate
        */
        int[] temp = new int[rotate];
        int cont=0;
        for(int index=0; index<rotate; index++){
            temp[index] = array[index];
        }
        for(int index=0; index<size-rotate; index++){
            array[index] = array[index+rotate];
            cont=index;
        }
        for(int index=0; index<rotate; index++){
            array[cont+index+1] = temp[index];
        }
        return array;
    }
}

public class PlayingWithNumbers {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size, rotate, array[];
        NumbersUtil cp = new NumbersUtil();
        size = Integer.parseInt(in.readLine());
        array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = Integer.parseInt(in.readLine());
        }
        rotate = Integer.parseInt(in.readLine());
        array = cp.rotateArray(size, array, rotate);
        for(Integer number : array)
            System.out.print(number);
        System.out.println();
    }
}