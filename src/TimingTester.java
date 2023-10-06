/**
 * Test how long each sorting algorithm takes in milliseconds based on input list length
 *
 * @author Nicholas Un, Gabe Brown
 * @version 1.0, 9/20/23
 */
public class TimingTester {
    /**
     * Makes a random array with length elements with values ranging from 0 to range
     *
     * @param elements how many elements going to be in the list
     * @param range upper bound for how big the elements will be in the list
     * @return randomized list under parameters elements and range
     */
    public static int[] generateRandList(int elements, int range){
        //generates list with length arrLength
        int[] arr = new int[elements];
        for(int i = 0; i < elements;i++) {
            arr[i] = (int) (Math.random() * range);
        }
        return arr;
    }

    /**
     * Runs sorting algorithm sortID with randArr and returns how long it took
     *
     * @param randArr input random array
     * @param sortID which sort algorithm will be tested
     * @return how many milliseconds had passed after sort algorithm ran
     */
    public static int methodTimed(int[] randArr, int sortID){
        long beforeTime = System.currentTimeMillis();
        if(sortID == 0){
            QuadSorts.bubbleSort(randArr);
        } else if(sortID == 1){
            QuadSorts.selectionSort(randArr);
        } else if(sortID == 2){
            QuadSorts.insertionSort(randArr);
        } else if(sortID == 3){
            QuadSorts.mergeSort(randArr);
        }
        long afterTime = System.currentTimeMillis();
        return (int)(afterTime - beforeTime);
    }

    /**
     * Identifies which sorting algorithm corresponds to sortID and returns it in string form
     *
     * @param sortID which sorting algorithm was run
     * @return which Sort was run
     */
    public static String sortType(int sortID){
        String sortType = "";
        if(sortID == 0){
            sortType = "bubbleSort";
        } else if(sortID == 1){
            sortType = "selectionSort";
        } else if(sortID == 2){
            sortType = "insertionSort";
        } else if(sortID == 3){
            sortType = "mergeSort";
        }
        return sortType;
    }
    public static void main(String[] args) {
        int[] arr = generateRandList(100, 100);
        for (int i = 0; i < 4; i++){
            System.out.println("Algorithm " + sortType(i) + " finished in " + methodTimed(arr, i) + " milliseconds.");
        }
    }
}
