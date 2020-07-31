package jc;

import java.util.Optional;
import java.util.Scanner;

public class OptionChooser {

    private final OperationList operationList;

    public OptionChooser(OperationList operationList) {
        this.operationList = operationList;
    }

    public void chooseOptions() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println(operationList.listAll());
            System.out.println("Press 'q' to quit.");
            System.out.print("Your choice: ");
            String option = in.nextLine().trim();

            if (option.equalsIgnoreCase("q")) {
                System.out.println("Bye!");
                break;
            }

            if (!option.matches("[1-9][0-9]*")) {
                System.out.println("You need to enter a positive number.");
                continue;
            }

            Optional<String> success = operationList.execute(Integer.parseInt(option));
            System.out.println(success.orElse("Operation %s is not available"));
        }
    }
}
