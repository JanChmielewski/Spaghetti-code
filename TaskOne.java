import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaskOne {

    public static final Scanner in = new Scanner(System.in);

    public void list() {

        System.out.println("Enter a list of numbers and please separate them by commas.");
        System.out.println("Example: ");
        System.out.println("1,2,3,4,...,");
        System.out.print("Enter some numbers: ");

        String line = in.nextLine();
        String[] numbers = line.split(",");
        List<Integer> inputs = new ArrayList<>();
        for (String number : numbers) {
            inputs.add(Integer.valueOf((number)));
        }

        menu(inputs);

    }


    void menu(List <Integer> inputs) {
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


        String choice = in.nextLine();

        switch (choice) {
            case "1":
                System.out.println("Unsorted list: " + inputs);
                break;
            case "2":
                List<Integer> sortedList = sort(inputs);

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
                System.out.println("The lowest value is: " + minValue(inputs));
                break;
            case "4":
                System.out.println("The highest value is: " + maxValue(inputs));
                break;
            case "5":
                System.out.println("There are: " + oddAmount(inputs) + " odd numbers");
                break;
            case "6":
                System.out.println("There are: " + evenAmount(inputs) + " even numbers");
                break;
            case "7":
                System.out.println("The sum of the first half is: " + printFirstHalfSum(inputs));
                break;
            case "8":
                System.out.println("The sum of the second half is: " + printSecondHalfSum(inputs));
                break;
            case "9":
                Integer firstHalf = printFirstHalfSum(inputs);
                Integer secondHalf = printSecondHalfSum(inputs);

                if (firstHalf > secondHalf) {
                    System.out.println("The sum of the first half is grater!");
                } else if (firstHalf < secondHalf) {
                    System.out.println("The sum of the second half is grater!");
                } else {
                    System.out.println("Halves are equal!");
                }
                break;
            default:
                System.out.println("Invalid selection!");
                menu(inputs);
        }
    }

        public Integer minValue (List < Integer > inputs) {
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

        public Integer maxValue (List < Integer > inputs) {
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

        public List<Integer> sort (List < Integer > inputs) {
            List<Integer> inputsArray = bubbleSort(new ArrayList<>(inputs));
            return inputsArray;
        }

        public Integer oddAmount (List < Integer > inputs) {
            Integer oddAmount = 0;
            for (int i = 0; i < inputs.size(); i++) {
                if (inputs.get(i) % 2 != 0) {
                    oddAmount++;
                }
            }
            return oddAmount;
        }

        public Integer evenAmount (List < Integer > inputs) {
            Integer evenAmount = 0;

            for (int i = 0; i < inputs.size(); i++) {
                if (inputs.get(i) % 2 == 0) {
                    evenAmount++;
                }
            }
            return evenAmount;
        }

        public Integer printFirstHalfSum (List < Integer > inputs) {
            Integer firstHalf = 0;

            for (int i = 0; i < inputs.size(); i++) {
                if (i < (inputs.size() / 2)) {
                    firstHalf += inputs.get(i);
                }
            }
            return firstHalf;
        }

        public Integer printSecondHalfSum (List < Integer > inputs) {

            Integer secondHalf1 = 0;

            for (int i = 0; i < inputs.size(); i++) {
                if (i >= (inputs.size() / 2)) {
                    secondHalf1 += inputs.get(i);
                }
            }
            Integer secondHalf = secondHalf1;
            if ((inputs.size() / 2) != (inputs.size() - (inputs.size() / 2))) {
                secondHalf = secondHalf - inputs.get(inputs.size() - 1);
            }

            return secondHalf;

        }

        public List<Integer> bubbleSort (List < Integer > inputs) {

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


