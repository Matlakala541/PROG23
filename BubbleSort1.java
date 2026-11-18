public class BubbleSort1 {


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            // Last i elements are already in place, so we do n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                // If current element is greater than next, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // A swap happened
                }
            }

            // If no swaps in inner loop, array is already sorted - optimization
            if (!swapped) {
                break;
            }
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}