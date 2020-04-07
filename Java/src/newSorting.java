public class newSorting {

    public static void main(String[] args) {

        //int[] array = {0, 3, 4, 5, 7};
        //int size = 1;
       //new newSorting(array, size);

        // ** Testing merge **
        int[] array = new int[10];
        int[] left = {0, 1, 3, 4, 6, 9}; // 0, 1, 3, 4, 6, 9
        int[] right = {2, 5, 7, 8}; // 2, 5, 7, 8

        mergeSortedHalves(array, left, right);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

     newSorting(int[] array, int size) {

        // Base Case: If the length of the array is less or equal to size
        if(array.length <= size) {

            // Calling the quickSort Method
            quickSort(array);

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

            new newSorting(leftSide, size);
            new newSorting(rightSide, size);
            mergeSortedHalves(array, leftSide, rightSide);

        }
    }

    public void quickSort(int[] array) {}

    public static void mergeSortedHalves(int[] array, int[] leftSide, int[] rightSide) {

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
