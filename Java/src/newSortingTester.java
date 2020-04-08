import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {

    @Test
    // TESTING ARRAY: {3, 1, 2}
    // EXPECTED ARRAY: {1, 2, 3}
    // TESTING SIZE: 1
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a simple array
    public void test_1() {

        // Creating the testing variables
        int[] arrayToBeSorted = {3, 1, 2};
        int size = 1;

        // Running newSorting() and passing arrayToBeSorted by reference
        new newSorting(arrayToBeSorted, size);

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
    public void test_2() {

        // Creating the testing variables
        int[] arrayToBeSorted = {4, 3, 5, 2, 1, 3};
        int size = 2;

        // Running newSorting() and passing arrayToBeSorted by reference
        new newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {1, 2, 3, 3, 4, 5};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: ---
    // TESTING SIZE: ---
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a
    public void test_3() {

        // Creating the testing variables
        int[] arrayToBeSorted = {};
        int size = 0;

        // Running newSorting() and passing arrayToBeSorted by reference
        new newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: ---
    // TESTING SIZE: ---
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a
    public void test_4() {

        // Creating the testing variables
        int[] arrayToBeSorted = {};
        int size = 0;

        // Running newSorting() and passing arrayToBeSorted by reference
        new newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

    @Test
    // TESTING ARRAY: ---
    // TESTING SIZE: ---
    // TEST: PASSED
    // TEST DESCRIPTION: Ensure that newSorting() functions properly given a
    public void test_5() {

        // Creating the testing variables
        int[] arrayToBeSorted = {};
        int size = 0;

        // Running newSorting() and passing arrayToBeSorted by reference
        new newSorting(arrayToBeSorted, size);

        // This is the expected array
        int[] expectedArray = {};

        // Comparing expectedArray with arrayToBeSorted
        assertArrayEquals(expectedArray, arrayToBeSorted);
    }

}
