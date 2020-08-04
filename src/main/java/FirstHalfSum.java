import java.util.List;

public class FirstHalfSum {

    List<Integer> inputs;
    public FirstHalfSum(List<Integer> inputs) { this.inputs = inputs; }

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
}
