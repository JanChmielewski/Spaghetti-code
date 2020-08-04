import java.util.List;

public class SortedList {

    List<Integer> inputsArray;
    public SortedList(List<Integer> inputs) { inputsArray = inputs; }

    BubbleSortedList bubble = new BubbleSortedList();


    public List<Integer> sort() {
        inputsArray = bubble.bubbleSort();
        return inputsArray;
    }
}
