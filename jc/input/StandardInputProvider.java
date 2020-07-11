package jc.input;

import java.util.Scanner;
import java.util.stream.Stream;

public class StandardInputProvider implements InputProvider {

    @Override
    public int[] getList() {
        int[] result;
        while (true) {
            System.out.println();
            System.out.print(message());

            Scanner in = new Scanner(System.in);
            String line = in.nextLine().trim();

            if (line.length() == 0) {
                System.out.println("You need to provide at least 1 number.");
                continue;
            }

            String[] tokens = line.split(",");

            if (tokens.length == 0) {
                System.out.println("The list seems to be empty.");
                continue;
            }

            boolean isInputVlaid = Stream.of(tokens).allMatch(token -> token.matches("[1-9][0-9]*"));

            if (!isInputVlaid) {
                System.out.println("Found non numbers on the list");
                continue;
            }

            result = Stream.of(tokens).mapToInt(Integer::parseInt).toArray();
            break;
        }
        return result;
    }

    private String message() {
        return "Enter a list of numbers and please separate them by commas.\n"
                + "Example: \n"
                + "1,2,3,4,...,\n"
                + "Enter some numbers: ";

    }

}
