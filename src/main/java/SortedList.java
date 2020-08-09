import java.util.List;

public class SortedList {

    List<Integer> inputsArray;
    BubbleSortedList bubble;
    public SortedList(List<Integer> inputs) {
        inputsArray = inputs;
        bubble = new BubbleSortedList(inputsArray);
    }


    public List<Integer> sort() {
        inputsArray = bubble.bubbleSort();
        return inputsArray;
    }
}
