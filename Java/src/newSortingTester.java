import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {

    @Test
    // TESTING ARRAY: {3, 1, 2}
    // EXPECTED ARRAY: {1, 2, 3}
    // TESTING SIZE: 2
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a simple array
    // TESTING PURPOSE: If this test case does not pass, it is almost guaranteed that no other test will pass
    public void test_1() {

        // Creating the testing variables
        int[] arrayToBeSorted = {3, 1, 2};
        int size = 2;

        // Running newSorting() and passing arrayToBeSorted by reference
        newSorting ns = new newSorting();

        // Making the call to newSorting()
        ns.newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {1, 2, 3};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: {4, 3, 5, 2, 1, 3}
    // EXPECTED ARRAY: {1, 2, 3, 3, 4, 5}
    // TESTING SIZE: 3
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given an array with duplicates
    // TESTING PURPOSE: This is ensuring that the method can handle duplicate numbers as it compares
    public void test_2() {

        // Creating the testing variables
        int[] arrayToBeSorted = {4, 3, 5, 2, 1, 3};
        int size = 3;

        // Running newSorting() and passing arrayToBeSorted by reference
        newSorting ns = new newSorting();

        // Making the call to newSorting()
        ns.newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {1, 2, 3, 3, 4, 5};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: {-4, -3, -5, -1, -7}
    // EXPECTED ARRAY: {-7, -5, -4, -3, -1}
    // TESTING SIZE: 1
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given an array full of negative numbers
    // TESTING PURPOSE: This ensures that given negatives, still sorts correctly in descending order
    public void test_3() {

        // Creating the testing variables
        int[] arrayToBeSorted = {-4, -3, -5, -1, -7};
        int size = 1;

        // Running newSorting() and passing arrayToBeSorted by reference
        newSorting ns = new newSorting();

        // Making the call to newSorting()
        ns.newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {-7, -5, -4, -3, -1};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: {5, 9, 1000, 3, 7, -33, -9, -500, 999, -800, 50, 9000}
    // EXPECTED ARRAY: {-800, -500, -33, -9, 3, 5, 7, 9, 50, 999, 1000, 9000}
    // TESTING SIZE: 1
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a large array
    // TESTING PURPOSE: This test the endurance of the code as it needs to run longer
    public void test_4() {

        // Creating the testing variables
        int[] arrayToBeSorted = {5, 9, 1000, 3, 7, -33, -9, -500, 999, -800, 50, 9000};
        int size = 1;

        // Running newSorting() and passing arrayToBeSorted by reference
        newSorting ns = new newSorting();

        // Making the call to newSorting()
        ns.newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {-800, -500, -33, -9, 3, 5, 7, 9, 50, 999, 1000, 9000};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: {-33, 2, 69, 2, -69, 420}
    // EXPECTED ARRAY: {-69, -33, 2, 2, 69, 420}
    // TESTING SIZE: 4
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a array with negative, duplicates and some MEME worthy numbers
    // TEST PURPOSE: This is the ULTIMATE test. Combines negative, duplicates, and large numbers for it to sort.
    public void test_5() {

        // Creating the testing variables
        int[] arrayToBeSorted = {-33, 2, 69, 2, -69, 420};
        int size = 4;

        // Running newSorting() and passing arrayToBeSorted by reference
        newSorting ns = new newSorting();

        // Making the call to newSorting()
        ns.newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {-69, -33, 2, 2, 69, 420};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }
}
