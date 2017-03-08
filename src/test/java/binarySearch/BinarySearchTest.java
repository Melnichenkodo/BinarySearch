package binarySearch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class BinarySearchTest {

    @DataProvider(name = "test")
    public static Object[][] dataForTest() {
        return new Object[][]{
                //Без сдвига
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 8, 7},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2, 1},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1, 0},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 9},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6, 5},
                //Со сдвигом
                {new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8}, 7, 8},
                {new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8}, 2, 3},
                {new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8}, 10, 1},
                {new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4}, 1, 6},
                {new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4}, 6, 1},
                {new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3, 4}, 10, 5},
                {new int[]{4, 5, 6, 7, 8, 9, 10, 1, 2, 3}, 2, 8},
                {new int[]{4, 5, 6, 7, 8, 9, 10, 1, 2, 3}, 10, 6},
                {new int[]{4, 5, 6, 7, 8, 9, 10, 1, 2, 3}, 6, 2},

        };
    }

    @Test(dataProvider = "test")
    public void binarySearchShouldReturnProperResult(int[] mas, int targetValue, int expectedResult) {
        BinarySearch binarySearch = new BinarySearch(mas);
        int actualResult = binarySearch.findIndex(targetValue);
        assertEquals(actualResult, expectedResult);
    }
}
