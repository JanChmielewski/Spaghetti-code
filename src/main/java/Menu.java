
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    Scanner in = new Scanner(System.in);

    public List<Integer> list() {

        System.out.println("Enter a list of numbers and please separate them by commas.");
        System.out.println("Example: ");
        System.out.println("1,2,3,4,...,");
        System.out.print("Enter some numbers: ");

        String line = in.nextLine();
        if (line.equals("")) {
            System.out.println("Invalid input!");
            list();
        }

        String[] numbers = line.split(",");
        List<Integer> inputs = new ArrayList<>();
        for (String number : numbers) {
            inputs.add(Integer.valueOf((number)));
        }

        menu(inputs);

        return inputs;
    }

    void menu(List<Integer> inputs) {

        TaskOne tsOne = new TaskOne(inputs);
        MinValue minVal = new MinValue(inputs);
        MaxValue maxVal = new MaxValue(inputs);
        SortedList sort = new SortedList(inputs);
        String choice = "";

        while (choice != "Q") {

            System.out.println("The list of thing I can do");
            System.out.println("1. Print unsorted list");
            System.out.println("2. Sort");
            System.out.println("3. Show the lowest value of the list");
            System.out.println("4. Show the highest value of the list");
            System.out.println("5. Show the amount of odd numbers");
            System.out.println("6. Show the amount of even numbers");
            System.out.println("7. Show the sum of the first half of the list");
            System.out.println("8. Show the sum of the second half of the list");
            System.out.println("9. Compare two halves of the list");
            System.out.println("(Q)uit");
            System.out.print("Your choice: ");

            choice = in.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Unsorted list: " + inputs);

                    break;
                case "2":
                    List<Integer> sortedList = sort.sort();

                    System.out.print("[");
                    for (int i = 0; i < sortedList.size(); i++) {
                        Integer s = sortedList.get(i);
                        System.out.print(s);
                        if (i < sortedList.size() - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.print("]");

                    break;
                case "3":
                    System.out.println("The lowest value is: " + minVal.minValue());

                    break;
                case "4":
                    System.out.println("The highest value is: " + maxVal.maxValue());

                    break;
                case "5":
                    System.out.println("There are: " + tsOne.oddAmount() + " odd numbers");

                    break;
                case "6":
                    System.out.println("There are: " + tsOne.evenAmount() + " even numbers");

                    break;
                case "7":
                    System.out.println("The sum of the first half is: " + tsOne.printFirstHalfSum());

                    break;
                case "8":
                    System.out.println("The sum of the second half is: " + tsOne.printSecondHalfSum());
                    break;
                case "9":
                    Integer firstHalf = tsOne.printFirstHalfSum();
                    Integer secondHalf = tsOne.printSecondHalfSum();

                    if (firstHalf > secondHalf) {
                        System.out.println("The sum of the first half is grater!");
                    } else if (firstHalf < secondHalf) {
                        System.out.println("The sum of the second half is grater!");
                    } else {
                        System.out.println("Halves are equal!");
                    }
                    break;
                case "Q":
                case "q":
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
