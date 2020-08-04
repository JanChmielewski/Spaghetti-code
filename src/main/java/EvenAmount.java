import java.util.List;

public class EvenAmount {

    List<Integer> inputs;

    public EvenAmount(List<Integer> inputs) { this.inputs = inputs; }

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
}
