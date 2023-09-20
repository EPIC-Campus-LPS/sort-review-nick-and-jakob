/**
 * Test how long each sorting algorithm takes in milliseconds based on input list length
 *
 * @author Nicholas Un, Gabe Brown
 * @version 1.0, 9/20/23
 * @see int[], java.util.Random
 */
import java.util.Random;
public class TimingTester {
    // length of list generated
    public static void main(String[] args) {
        int arrLength = 500000;
        //generates list with length arrLength
        int[] arr = new int[arrLength];
        for(int i = 0; i<arrLength;i++) {
            arr[i] = (int) (Math.random() * arrLength);
        }
        // gets time before running the sorts, runs the sorts, gets time after and subtracts the before from after to get how much time it took
        long beforeTime, afterTime;
        //bubbleSort Time Test
        beforeTime = System.currentTimeMillis();
        QuadSorts.bubbleSort(arr);
        afterTime = System.currentTimeMillis();
        System.out.println("bubbleSort took " + (afterTime - beforeTime) + " milliseconds with a list length of " + arrLength + ".");
        // selectionSort Time Test
        beforeTime = System.currentTimeMillis();
        QuadSorts.selectionSort(arr);
        afterTime = System.currentTimeMillis();
        System.out.println("selectionSort took " + (afterTime - beforeTime) + " milliseconds with a list length of " + arrLength + ".");
        // insertionSort Time Test
        beforeTime = System.currentTimeMillis();
        QuadSorts.insertionSort(arr);
        afterTime = System.currentTimeMillis();
        System.out.println("insertionSort took " + (afterTime - beforeTime) + " milliseconds with a list length of " + arrLength + ".");
        // mergeSort Time Test
        beforeTime = System.currentTimeMillis();
        QuadSorts.mergeSort(arr);
        afterTime = System.currentTimeMillis();
        System.out.println("mergeSort took " + (afterTime - beforeTime) + " milliseconds with a list length of " + arrLength + ".");
    }
}
