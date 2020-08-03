import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    public static final List<Integer> INTEGERS = List.of(0, 3, 1, 2, 3, 4, 1, 2, 5, 6, 8, 30);
    public static final ArrayList<Integer> INPUTS = new ArrayList<>(INTEGERS);
    TaskOne tsOne = new TaskOne(INPUTS);
    GetMinValue minVal = new GetMinValue(INPUTS);

    @Test
    public void minValueGiven() {

        Integer min = minVal.minValue();
        assertEquals(0, min);
    }

    @Test
    public void maxValueGiven() {

        Integer max = tsOne.maxValue();
        assertEquals(30, max);
    }

    @Test
    public void bubblesortGivenList() {
        List<Integer> collectionsSortedList = new ArrayList<>(INTEGERS);
        List<Integer> sortedList = tsOne.bubbleSort();
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
        List<Integer> sortedList = tsOne.sort();
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