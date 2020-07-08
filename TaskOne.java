import java.util.*;

/**
 * 2. oddzielenie metod od wyświetlania tekstu
 * 3. przypisać każdej metodzie tylko jedna odpowiedzalność
 */

public class TaskOne {

    public static final Scanner in = new Scanner(System.in);

    public void list() {
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
        System.out.print("Your choice: ");

        int choice = Integer.parseInt(in.nextLine().trim());

        System.out.println("Enter a list of numbers and please separate them by commas.");
        System.out.println("Example: ");
        System.out.println("1,2,3,4,...,");
        System.out.println("Enter some numbers: ");

        String line = in.nextLine();
        String[] numbers = line.split(",");
        List<Integer> inputs = new ArrayList<>();
        for (String number : numbers) {
            inputs.add(Integer.valueOf((number)));
        }

        switch (choice) {
            case 1:
                System.out.println("Unsorted list: " + inputs);
                break;
            case 2:
                sort(inputs);

                System.out.print("[");
                for (Integer s : inputs) {
                    System.out.print(s + ", ");
                }
                System.out.print("\b");
                System.out.print("\b");
                System.out.print("]");
                break;
            case 3:
                System.out.println("The lowest value is: " + Collections.min(inputs));
                break;
            case 4:
                System.out.println("The highest value is: " + Collections.max(inputs));
                break;
            case 5:
                System.out.println("There are: " + oddAmount(inputs) + " odd numbers");
                break;
            case 6:
                System.out.println("There are: " + evenAmount(inputs) + " even numbers");
                break;
            case 7:
                System.out.println("The sum of the first half is: " + printFirstHalfSum(inputs));
                break;
            case 8:
                System.out.println("The sum of the second half is: " + printSecondHalfSum(inputs));
                break;
            case 9:

                if (printFirstHalfSum(inputs) > printSecondHalfSum(inputs)) {
                    System.out.println("The sum of the first half is grater!");
                } else if (printFirstHalfSum(inputs) < printSecondHalfSum(inputs)) {
                    System.out.println("The sum of the second half is grater!");
                } else {
                    System.out.println("Halves are equal!");
                }

//                compareHalves(inputs));
                break;
        }
    }

    public List<Integer> sort(List<Integer> inputs) {
        List<Integer> inputsArray = bubbleSort(inputs);
        return inputsArray;
    }

    public int oddAmount(List<Integer> inputs) {
        int oddAmount = 0;
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i) % 2 != 0) {
                oddAmount++;
            }
        }
        return oddAmount;
    }

    public int evenAmount(List<Integer> inputs) {
        int evenAmount = 0;

        for (int i = 0; i < inputs.size(); i++) {
            if(inputs.get(i) % 2 == 0) {
                evenAmount++;
            }
        }
        return evenAmount;
    }

    public int printFirstHalfSum(List<Integer> inputs) {
        int firstHalf = 0;

        for (int i = 0; i < inputs.size(); i++) {
            if (i < (inputs.size() / 2)) {
                firstHalf += inputs.get(i);
            }
        }
        return firstHalf;
    }

    public int printSecondHalfSum(List<Integer> inputs) {
        int secondHalf = 0;

        for (int i = 0; i < inputs.size(); i++) {
            if (i >= (inputs.size() / 2)) {
                secondHalf += inputs.get(i);
            }
        }
        return secondHalf;
    }

//    public void compareHalves(List<Integer> inputs) {
//
//        if ((inputs.size() / 2) != (inputs.size() - (inputs.size() / 2))) {
//            int secondHalf = printSecondHalfSum(inputs);
//            secondHalf = secondHalf - inputs.get(inputs.size() - 1);
//        }
//
//    }

    public List<Integer> bubbleSort(List<Integer> inputs) {

        for (int i = 0; i < inputs.size(); i++) {
            for (int j = 0; j < inputs.size() - 1; j++) {
                if (inputs.get(j) > inputs.get(j + 1)) {
                    int temp = inputs.get(j + 1);
                    inputs.set(j + 1, inputs.get(j));
                    inputs.set(j, temp);
                }
            }
        }
        return inputs;
    }

}

