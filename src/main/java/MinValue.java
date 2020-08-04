import java.util.List;

public class MinValue {

    List<Integer> inputs;

    public MinValue(List<Integer> inputs) { this.inputs = inputs; }

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
}
