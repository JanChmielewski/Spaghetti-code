import java.util.List;

public class SecondHalfSum {

    List<Integer> inputs;
    public SecondHalfSum(List<Integer> inputs) { this.inputs = inputs; }

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
}
