import java.util.List;

public class OddAmount {

    List<Integer> inputs;
    public OddAmount(List<Integer> inputs) { this.inputs = inputs; }

    public Integer oddAmount() {
        Integer oddAmount = 0;
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i) % 2 != 0) {
                oddAmount++;
            }

        }
        return oddAmount;
    }
}
