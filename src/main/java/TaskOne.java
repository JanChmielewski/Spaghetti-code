import java.util.List;

public class TaskOne {

    List<Integer> inputs;

    public TaskOne(List<Integer> inputs) { this.inputs = inputs; }

    public Integer minValue() {
        Integer min = 0;
        for (int i = 0; i < inputs.size(); i++) {
            min = inputs.get(i);
            for (int number : inputs) {
                if (number < min) {
                    min = number;
                }
            }

        }
        return min;
    }

    public Integer maxValue() {
        Integer max = 0;
        for (int i = 0; i < inputs.size(); i++) {
            max = inputs.get(i);
            for (int number : inputs) {
                if (number > max) {
                    max = number;
                }
            }

        }
        return max;
    }

    public List<Integer> sort() {
        List<Integer> inputsArray = bubbleSort();
        return inputsArray;
    }

    public Integer oddAmount() {
        Integer oddAmount = 0;
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i) % 2 != 0) {
                oddAmount++;
            }

        }
        return oddAmount;
    }

    public Integer evenAmount() {
        Integer evenAmount = 0;

        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i) % 2 == 0) {
                evenAmount++;
            }

            if (inputs.get(i) == 0) {
                evenAmount--;
            }

        }
        return evenAmount;
    }

    public Integer printFirstHalfSum() {
        Integer firstHalf1 = 0;

        for (int i = 0; i < inputs.size(); i++) {
            if (i < (inputs.size() / 2)) {
                firstHalf1 += inputs.get(i);
            }
        }

        Integer firstHalf = firstHalf1;

        return firstHalf;
    }

    public Integer printSecondHalfSum() {

        Integer secondHalf1 = 0;

        for (int i = 0; i < inputs.size(); i++) {
            if (i >= (inputs.size() / 2)) {
                secondHalf1 += inputs.get(i);
            }
        }
        Integer secondHalf = secondHalf1;
        if ((inputs.size() / 2) != (inputs.size() - (inputs.size() / 2))) {
            secondHalf = secondHalf - inputs.get(inputs.size() - 1);
        }
        return secondHalf;

    }

    public List<Integer> bubbleSort() {

        for (int i = 0; i < inputs.size(); i++) {
            for (int j = 0; j < inputs.size() - 1; j++) {
                if (inputs.get(j) > inputs.get(j + 1)) {
                    int temp = inputs.get(j + 1);
                    inputs.set(j + 1, inputs.get(j));
                    inputs.set(j, temp);
                }
            }
        }
        return inputs;
    }

}
