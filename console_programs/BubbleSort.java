package console_programs;

public class BubbleSort {
    public static void main(String[] args) {
        // array to be sorted
        int[] arr = {99, 34, 28, 12, 22, 16, 90};
        // calling the bubbleSort function
        bubbleSort(arr);
        // print out the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // bubbleSort function to sort an array of integers
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // last i elements are already in place
            // loop through the array
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

/*
 * the main method creates an array of integers and calls the 
 * bubbleSort function. The bubbleSort function takes an array 
 * of integers as its parameter. The function starts by defining 
 * a variable n as the length of the array. Then, it uses two 
 * nested for loops to iterate through the array. The outer 
 * for loop runs for n-1 times, and the inner for loop runs
 *  for n-i-1 times.

 * The inner for loop compares each element of the array with 
 * the next element. If the current element is greater than the 
 * next element, the program swaps them. This process is repeated 
 * for all elements of the array, and the largest element 
 * "bubbles up" to the end of the array. The outer for loop then
 *  repeats this process for the remaining n-1 elements of the
 *  array, so that the second-largest element "bubbles up" to the
 *  second-to-last position, and so on.

 * The program then prints out the sorted array after the function call.
 */
