import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    public static final List<Integer> INTEGERS = List.of(0, 3, 1, 2, 3, 4, 1, 2, 5, 6, 8, 30);
    public static final ArrayList<Integer> INPUTS = new ArrayList<>(INTEGERS);
    TaskOne tsOne = new TaskOne(INPUTS);
    MinValue minVal = new MinValue(INPUTS);
    MaxValue maxVal = new MaxValue(INPUTS);
    SortedList sort = new SortedList(INPUTS);
    BubbleSortedList bubble = new BubbleSortedList(INPUTS);

    @Test
    public void minValueGiven() {

        Integer min = minVal.minValue();
        assertEquals(0, min);
    }

    @Test
    public void maxValueGiven() {

        Integer max = maxVal.maxValue();
        assertEquals(30, max);
    }

    @Test
    public void bubblesortGivenList() {
        List<Integer> collectionsSortedList = new ArrayList<>(INTEGERS);
        List<Integer> sortedList = bubble.bubbleSort();
        Collections.sort(collectionsSortedList);
        assertEquals(sortedList, collectionsSortedList);
    }

    @Test
    public void firstHalfSumTest() {
        Integer firstHalfSum = tsOne.printFirstHalfSum();

        assertEquals(13, firstHalfSum);
    }

    @Test
    public void secondHalfSumTest() {
        Integer secondHalfSum = tsOne.printSecondHalfSum();

        assertEquals(52, secondHalfSum);
    }

    @Test
    public void sortGivenList() {
        List<Integer> sortedList = sort.sort();
        List<Integer> collectionsSortedList = new ArrayList<>(INTEGERS);
        Collections.sort(collectionsSortedList);
        assertEquals(sortedList, collectionsSortedList);
    }

    @Test
    public void oddNumbersAmount() {
        Integer oddAmount = tsOne.oddAmount();

        assertEquals(5, oddAmount);
    }

    @Test
    public void evenNumbersAmount() {
        Integer evenAmount = tsOne.evenAmount();

        assertEquals(6, evenAmount);
    }

}