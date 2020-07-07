import java.util.*;

/**
 * 1. sortowanie bąbelkowe w osobnej metodzie
 * 2. oddzielenie metod od wyświetlania tekstu
 * 3. przypisać każdej metodzie tylko jedna odpowiedzalność
 *
 */

public class TaskOne {

    public static final Scanner in = new Scanner(System.in);

    public void list() {
        List<Integer> inputs = this.entrMsg();
        this.menu(inputs);
    }

    public List<Integer> entrMsg() {
        System.out.println("Enter a list of numbers you would like to sort and please separate them by commas.");
        System.out.println("Example: ");
        System.out.println("1,2,3,4,...,");
        System.out.println("Enter some numbers: ");

        String line = in.nextLine();
        List<String> numbers = Arrays.asList(line.split(","));
        List<Integer> inputs = new ArrayList<>();
        for (String number : numbers) {
            inputs.add(Integer.valueOf((number)));
        }

        System.out.println("Unsorted list: " + inputs);
        return inputs;
    }

//    void sort (List<Integer> inputs) {
//        Collections.sort(inputs);
//        System.out.println("Sorted list: " + inputs);
//    }

    void menu(List<Integer> inputs) {

        System.out.println("Here's a list of things I can do: ");
        System.out.println("1) Sort list    2) Show the lowest and highest value    3) Show the amount of odd and even numbers   4) Sum and compare two halves of the list");

        int decision = in.nextInt();
        switch (decision) {
            case 1:
                this.bubbleSort(inputs);
                break;
            case 2:
                this.value(inputs);
                break;
            case 3:
                this.evenOdd(inputs);
                break;
            case 4:
                this.sum(inputs);
                break;
            default:
                System.out.println("Invalid selection!");
                this.menu(inputs);
        }
    }

    void value (List<Integer> inputs) {
        Collections.sort(inputs);
        System.out.println("The lowest value is: " + inputs.get(0));
        System.out.println("The highest value is: " + inputs.get(inputs.size()-1));
    }

    void evenOdd (List<Integer> inputs) {
        int odd = 0, even = 0;
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i) % 2 != 0) {
                odd++;
            } else if (inputs.get(i) % 2 == 0) {
                even++;
            }
        }
        System.out.println("There are: " + odd + " odd numbers");
        System.out.println("There are: " + even + " even numbers");
    }

    void sum (List<Integer> inputs) {
        int firstHalf = 0, secondHalf = 0;
        int halfList = (inputs.size() / 2);

        for (int i = 0; i < inputs.size(); i++) {
            if (i < halfList) {
                firstHalf += inputs.get(i);
            } else {
                secondHalf += inputs.get(i);
            }
        }

        System.out.println("The sum of the first half is: " + firstHalf);
        System.out.println("The sum of the second half is: " + secondHalf);

        if (halfList != (inputs.size() - halfList)) {
            secondHalf = secondHalf - inputs.get(inputs.size() - 1);
        }

        if (firstHalf > secondHalf) {
            System.out.println("The sum of the first half is grater!");
        } else if (firstHalf < secondHalf) {
            System.out.println("The sum of the second half is grater!");
        } else {
            System.out.println("Halves are equal!");
        }
    }

    static void bubbleSort (List<Integer> inputs) {

        Integer[] inputsArray = inputs.toArray( new Integer[0]);

        for (int i = 0; i < inputsArray.length; i++) {
            for (int j = 0; j < inputsArray.length - 1; j++) {
                if (inputsArray[j] > inputsArray[j + 1]) {
                    int temp = inputsArray[j + 1];
                    inputsArray[j + 1] = inputsArray[j];
                    inputsArray[j] = temp;

                }
            }
        }
        for (Integer s : inputsArray) {
            System.out.print(s + ", ");
        }
    }

}
