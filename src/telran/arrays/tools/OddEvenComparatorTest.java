package telran.arrays.tools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OddEvenComparatorTest {
    Integer[] array;

	@BeforeEach
	public void setUp() throws Exception {
		array = new Integer[] {  9, 7, 4, 7, 2, 5, 9, 1, 0 };
    }

	@Test
	void testPrintArray() {
		System.out.println("Test printArray");
		OddEvenComparator.printArray(array);
	}

    @Test
    void testSortArray() {
        System.out.println("Test sortArray");
		OddEvenComparator.sortArray(array, null);
    }
}
