import java.util.ArrayList;
import java.util.List;

public class BubbleSortedList {

    List<Integer> inputsArray;
    public BubbleSortedList(List<Integer> inputsArray) { this.inputsArray = inputsArray; }

    public List<Integer> bubbleSort() {
        List<Integer> integerList = new ArrayList<>(inputsArray);

        for (int i = 0; i < integerList.size(); i++) {
            for (int j = 0; j < integerList.size() - 1; j++) {
                if (integerList.get(j) > integerList.get(j + 1)) {
                    int temp = integerList.get(j + 1);
                    integerList.set(j + 1, integerList.get(j));
                    integerList.set(j, temp);
                }
            }
        }
        return integerList;
    }

}
