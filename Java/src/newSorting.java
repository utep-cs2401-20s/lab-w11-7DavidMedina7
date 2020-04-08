public class newSorting {

    public static void main(String[] args){

        int[] arrayToBeSorted = {4, 3, 5, 2, 1, 3};
        int size = 3;

        new newSorting(arrayToBeSorted, size);

    }

     newSorting(int[] array, int size) {

        // Base Case: If the length of the array is less or equal to size
        if(array.length <= size) {

            // Initializing start and end variables
            int start = array[0];
            int end = array.length - 1;

            // Calling the quickSort Method
            quickSort(array, start, end);

            // Else split the array until the base case is met
        } else {

            // Creating the middle index
            int middleIndex = array.length / 2;

            // Initializing both left and right arrays
            int[] leftSide = new int[middleIndex];
            int[] rightSide = new int[array.length - middleIndex];

            // Populating the left array
            for(int i = 0; i < leftSide.length; i++) {
                leftSide[i] = array[i];
            }

            // Populating the right array
            for(int i = 0; i < rightSide.length; i++) {
                rightSide[i] = array[middleIndex + i];
            }

            // Method call on the left array
            new newSorting(leftSide, size);

            // Method call on the right array
            new newSorting(rightSide, size);

            // Merging left and right arrays
            mergeSortedHalves(array, leftSide, rightSide);

        }
    }

    // Recursively sort utilizing quick sort
    void quickSort(int[] array, int start, int end) {

        // Checks if lowIndex is smaller than the highIndex; if not, the array is sorted.
        if(start < end) {

            // Making the "middle" index of the array
            int partitionIndex = partition(array, start, end);

            // Sorting the left side of the array
            quickSort(array, start, partitionIndex - 1);

            // Sorting the right side of the array
            quickSort(array, partitionIndex + 1, end);
        }
    }

    // Helper method to aid and partition array from quickSort() method
    int partition(int[] array, int start, int end) {

        // Initializing pivot to the array at start
        int pivot = array[start];

        // Loop to go through array and alter
        for(int i = start; i < end; i++) {

            // If current element is smaller than the pivot
            if(array[i] <= pivot) {

                // Increment start
                start++;

                // Swap pivot with current element
                int temp = pivot;
                pivot = array[i];
                array[i] = temp;
            }
        }

        // Swap pivot with end
        int temp = array[end + 1];
        array[end + 1] = array[start];
        array[start] = temp;

        // Returning the "middle" index
        return end + 1;
    }

    void mergeSortedHalves(int[] array, int[] leftSide, int[] rightSide) {

        // Pointers pointing at the first element of each left and right arrays
        int leftPointer = 0;
        int rightPointer = 0;

        // Preventing out of bounds exception and iterating through...
        for (int i = 0; leftPointer < leftSide.length || rightPointer < rightSide.length; i++) {

            // If one array reaches the end, then just store the original array with the other array

            // If the pointer is equal to the length of the left array
            if(leftPointer == leftSide.length) {

                // Place right element into original array
                array[i] = rightSide[rightPointer];

                // Increment right pointer
                rightPointer++;

                continue;
            }

            // If the pointer is equal to the length of the right array
            if(rightPointer == rightSide.length) {

                // Place right element into original array
                array[i] = leftSide[leftPointer];

                // Increment right pointer
                leftPointer++;

                continue;
            }

            // If the element at left is less than element at right
            if(leftSide[leftPointer] < rightSide[rightPointer]) {

                // Place the left element into the original array
                array[i] = leftSide[leftPointer];

                // Increment left pointer
                leftPointer++;

            } else if(leftSide[leftPointer] == rightSide[rightPointer]) {

                // Place the left element into the original array
                array[i] = leftSide[leftPointer];

                // Increment left pointer
                leftPointer++;

            } else {

                // Place the right element into original array
                array[i] = rightSide[rightPointer];

                // Increment right pointer
                rightPointer++;

            }
        }
    }
}
