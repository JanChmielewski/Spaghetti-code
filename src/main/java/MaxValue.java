
import java.util.List;

public class MaxValue {

    List<Integer> inputs;
    public MaxValue(List<Integer> inputs) { this.inputs = inputs; }

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
}