import java.util.*;

/**
 * 2. oddzielenie metod od wyświetlania tekstu
 * 3. przypisać każdej metodzie tylko jedna odpowiedzalność
 *
 */

public class TaskOne {

    public static final Scanner in = new Scanner(System.in);

    public void list(Integer[] inputsArray) {
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
                sort(inputs);

                System.out.print("[");
                // this inputsArray is a different variable than the one in sort() method,
                // did you want to assign return value from sort() and then use it in the for loop?
                for (Integer s : inputsArray) {
                    System.out.print(s + ", ");
                }

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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }
        public void sort (List < Integer > inputs) {
        bubbleSort(inputs);
        }

        void value (List < Integer > inputs) {
            Collections.sort(inputs);
            System.out.println("The lowest value is: " + inputs.get(0));
            System.out.println("The highest value is: " + inputs.get(inputs.size() - 1));
        }

        void evenOdd (List < Integer > inputs) {
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

        void sum (List < Integer > inputs) {
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

      public Integer[] bubbleSort (List <Integer> inputs) {

            Integer[] inputsArray = inputs.toArray(new Integer[0]);

            for (int i = 0; i < inputsArray.length; i++) {
                for (int j = 0; j < inputsArray.length - 1; j++) {
                    if (inputsArray[j] > inputsArray[j + 1]) {
                        int temp = inputsArray[j + 1];
                        inputsArray[j + 1] = inputsArray[j];
                        inputsArray[j] = temp;

                    }
                }
            }
          return inputsArray;
      }
}

