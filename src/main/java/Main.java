import jc.OperationList;
import jc.OptionChooser;
import jc.input.StandardInputProvider;

public class Main {
    public static void main(String[] args) {

        OptionChooser optionChooser = new OptionChooser(new OperationList(new StandardInputProvider()));

        optionChooser.chooseOptions();

    }
}
