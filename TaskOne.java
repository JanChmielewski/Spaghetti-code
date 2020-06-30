import java.util.*;

public class TaskOne {

    public static void list() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a list of numbers here.");
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

        System.out.println("Here's a list of things I can do: ");
        System.out.println("1) Sort list    2) Show the lowest and highest value    3) Show the amount of odd and even numbers   4) Sum and compare two halves of the list");
        int decision = in.nextInt();
        switch (decision) {
            case 1:
                Collections.sort(inputs);
                System.out.println("Sorted list: " + inputs);
                break;
            case 2:
                Collections.sort(inputs);
                System.out.println("The lowest value is: " + inputs.get(0));
                System.out.println("The highest value is: " + inputs.get(inputs.size()-1));
                break;
            case 3:
                int odd = 0, even=0;
                for(int i = 0; i<inputs.size(); i++) {
                    if (inputs.get(i) % 2 != 0)
                    { odd++; }

                    if (inputs.get(i) % 2 == 0)
                    { even++; }
                }
                System.out.println("There are: " + odd + " odd numbers");
                System.out.println("There are: " + even + " even numbers");
                break;
            case 4:
                int firstHalf = 0, secondHalf = 0;
                int halfList = (inputs.size()/2);

                for (int i = 0; i<inputs.size(); i++) {
                    if (i < halfList) {
                        firstHalf += inputs.get(i);
                    }
                    else {
                        secondHalf += inputs.get(i);
                    }
                }

                System.out.println("The sum of the first half is: " + firstHalf);
                System.out.println("The sum of the second half is: " + secondHalf);

                if (halfList != (inputs.size() - halfList)) {
                    secondHalf = secondHalf - inputs.get(inputs.size() - 1);
                }

                if (firstHalf>secondHalf) {
                    System.out.println("The sum of the first half is grater!");
                } else if (firstHalf<secondHalf){
                    System.out.println("The sum of the second half is grater!");
                } else {
                    System.out.println("Halves are equal!");
                }
                break;
            default:
                System.out.println("Invalid selection!");
        }
    }
}
