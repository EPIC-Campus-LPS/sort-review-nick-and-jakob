//Be sure to add your documentation here.

public class SortingTester {

    public static void main(String[] args) {

        int[] numElements = {10, 100 ,1000};

        for(int index = 0; index < numElements.length; index++){
            int NUM_ELEMENTS = numElements[index];

            int[][] testCases = new int[4][NUM_ELEMENTS]; //0 - bubble, 1 - selection, 2 - insertion, 3 - merge

            //Build a random array
            int[] originalList = new int[NUM_ELEMENTS];
            for(int i = 0; i < NUM_ELEMENTS; i++){
                originalList[i] = (int)(Math.random() * 1000) + 1;
            }

            //set each test case to deep copy of originalList
            for(int j = 0; j < testCases.length; j++){
                testCases[j] = copyArray(originalList);
            }

            //Sort them using each of the sorting methods
            QuadSorts.bubbleSort(testCases[0]);
            QuadSorts.selectionSort(testCases[1]);
            QuadSorts.insertionSort(testCases[2]);
            QuadSorts.mergeSort(testCases[3]);

            //Check if it worked
            if(inOrder(testCases[0]) && sameNumbers(originalList, testCases[0])){
                System.out.println("Passed Bubble #" + (index + 1));
            }

            if(inOrder(testCases[1]) && sameNumbers(originalList, testCases[1])){
                System.out.println("Passed Selection #" + (index + 1));
            }

            if(inOrder(testCases[2]) && sameNumbers(originalList, testCases[2])){
                System.out.println("Passed Insertion #" + (index + 1));
            }

            if(inOrder(testCases[3]) && sameNumbers(originalList, testCases[3])){
                System.out.println("Passed Merge #" + (index + 1));
            }



        }

    }



    /**
     * This function will return a deep copy of the given array
     */
    public static int[] copyArray(int[] arr){
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
        return copy;
    }


    /**
     * This function will determine whether the two passed arrays
     * (one sorted & one not) have the same number of each number.
     */
    public static boolean sameNumbers(int[] arr1, int[] arr2){
        //arr1 711 831 1 590 330 367 432 596 432 471
        //arr2 1 330 367 432 432 471 590 596 711 831
        int[] fTable1 = frequencyTable(arr1); // There is a 1 at spaces 710, 830, 0, 589, 329, 366, 595, 470, and a 2 at space 431, len 830
        int[] fTable2 = frequencyTable(arr2); // There is a 1 at spaces 710, 830, 0, 589, 329, 366, 595, 470, and a 2 at space 431, len 830

        if(fTable1.length != fTable2.length) // same length so ignores
            return false;

        for(int i = 0; i < fTable1.length; i++){
            if(fTable1[i] != fTable2[i]) // should be the same numbers in the same spaces, so should ignore
                return false;
        }
        return true; //returns true
    }

    public static int[] frequencyTable(int[] arr){ //ex: arr1 711 831 1 590 330 367 432 596 432 471
        //find min & max
        int min = arr[0]; //711
        int max = arr[0]; //711

        for(int num : arr){
            if(min > num)
                min = num;
            /*
             * 711 !> 831
             * 711 > 1
             * 1 !> the rest
             * min = 1
             */
            if(max < num)
                max = num;
            /*
             * 711 < 831
             * 831 < the rest
             * max = 831
             */
        }

        //tally numbers in array
        int[] fTable = new int[max - min + 1];
            // fTable is 831 - 1 + 1 long, or 831 spaces long
        for(int num : arr){
            fTable[num - min]++;
            // There is a 1 at spaces 710, 830, 0, 589, 329, 366, 595, 470, and a 2 at space 431
        }

        return fTable;
    }

    /**
     * This function will return whether the given array
     * is in non-decreasing order.
     */
    public static boolean inOrder(int[] arr){ //arr2 1 330 367 432 432 471 590 596 711 831
        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i] > arr[i + 1])
                return false;
        /*
         * 1 !> 330, fails
         * so how is bubble, selection, and insert passing
         */
        return true;
    }

}
