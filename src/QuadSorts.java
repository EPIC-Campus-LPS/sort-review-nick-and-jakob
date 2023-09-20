/**
 * Class of 4 different sorting algorithms
 *
 * @author Nicholas Un and Jakob Young
 * @version 1.0, 9/15/23
 * @see int[], array
 *
 */
public class QuadSorts {
    /**
     * Sorts input array arr by comparing every element by every other element
     * @param arr
     * @return sorted arr
     */
    public static int[] bubbleSort(int[] arr){
        int placeholder = 0;
        // for each element in the array (element1), for every element after element1, compare the two, and if the element after element1 is greater than it, then swap
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-(i+1); j++){
                if(arr[j] > arr[j+1]){
                    placeholder = arr [j+1];
                    arr [j+1] = arr[j];
                    arr[j] = placeholder;
                }
            }
        }
        return arr;
    }

    /**
     * Sorts input array arr by checking what the next unsorted index is and finding the smallest unsorted element to put in that index
     * @param arr
     * @return sorted arr
     */
    public static int[] selectionSort(int[] arr){
        int placeholder, phIndex;
        // for each element in the array (element1), compare element1 to each other element, if that element is smaller than element1, set the placeholder to the element that comes next
        //repeat that until the end of the list, then switch the two variable
        for(int i = 0; i < arr.length; i++){
            placeholder = arr[i]; phIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < placeholder){
                    placeholder = arr[j]; phIndex = j;
                }
            }
            arr[phIndex] = arr[i]; arr[i] = placeholder;
        }
        return arr;
    }

    /**
     * Sorts input array arr by comparing how the next unsorted element compares to the already sorted elements
     * @param arr
     * @return sorted arr
     */
    public static int[] insertionSort(int[] arr){
        int placeholder, counter;
        for(int i = 1; i < arr.length; i++){
            counter = i; placeholder = arr[i];
            while(counter > 0 && placeholder < arr[counter-1]){
                arr[counter] = arr[counter-1];
                counter--;
            }
            arr[counter] = placeholder;
        }
        /*
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("Insert Sort");
        System.out.println();
        */
        return arr;
    }

    /**
     * Sorts input array arr by breaking arr into 1-length sub-arrays then sorting the arrays by merging them with the element order based on which of the next elements in said sub-arrays is smaller
     * @param arr
     * @return sorted arr
     */
    public static int[] mergeSort(int[] arr){
        /*
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        */
        //for recursion, so it doesn't recurse infinitely
        if(arr.length == 1){
            return arr;
        }
        else{
            //initialize both subarrays, with lengths adding to the main array length, and fill them with their respective elements
            int[] arr1 = new int[arr.length/2]; int[] arr2 = new int[arr.length-(arr.length/2)];
            for(int i = 0; i < arr.length; i++){
                if(i < arr.length/2) {
                    arr1[i] = arr[i];
                }
                else{
                    arr2[i - (arr.length/2)] = arr[i];
                }
            }
            //use recursion to split the arrays until they are 1 long, and then make their way back up the chain
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            // once they are either 1 length or bigger than 1 and properly sorted, sort them
            // compare each of the next elements in subarrays 1 and 2, and put whichever is smallest at the start of the finalArray
            int counter1 = 0; int counter2 = 0;
            arr = new int[arr1.length+ arr2.length];
            while(counter1 < arr1.length && counter2 < arr2.length){
                if(arr1[counter1] <= arr2[counter2]){
                    arr[counter1 + counter2] = arr1[counter1];
                    counter1++;
                }
                else{
                    arr[counter1 + counter2] = arr2[counter2];
                    counter2++;
                }
            }
            // when it stops because it has reached the end of one subarray, check if the other subarray has been reached
            // if not, put the rest of the numbers into finalArray
            if(counter1 == arr1.length && counter2 != arr2.length){
                for(int i = counter2; i < arr2.length; i++){
                    arr[counter1 + i] = arr2[i];
                }
            }
            else if(counter2 == arr2.length && counter1 != arr1.length){
                for(int i = counter1; i < arr1.length; i++){
                    arr[i + counter2] = arr1[i];
                }
            }
            /*
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("Merge Sort");
            System.out.println();
            int[] finalArr = arr;
            */
            return arr;


        }
    }
}
