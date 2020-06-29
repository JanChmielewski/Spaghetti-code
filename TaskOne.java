import java.util.*;

public class TaskOne {

    public static void list() {

        System.out.println("Enter a list of numbers you would like to sort and please separate them by commas.");
        System.out.println("Example: ");
        System.out.println("1,2,3,4,...,");
        System.out.println("Enter some numbers: ");

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        List<String> numbers = Arrays.asList(line.split(","));
        List<Integer> inputs = new ArrayList<>();
        for (String number : numbers) {
            inputs.add(Integer.valueOf((number)));
        }

        System.out.println("Unsorted list: " + inputs);

        Collections.sort(inputs);
        System.out.println("Sorted list: " + inputs);

        System.out.println("The lowest value is: " + inputs.get(0));
        System.out.println("The highest value is: " + inputs.get(inputs.size()-1));

        int odd = 0;
        for(int i = 0; i<inputs.size(); i++) {
            if (inputs.get(i) % 2 != 0)
            {
                odd++;
            }
        }
        System.out.println("There are: " + odd + " odd numbers");

        int even = 0;

        for(int i = 0; i<inputs.size(); i++) {
            if (inputs.get(i) % 2 == 0)
            {
                even++;
            }
        }
        System.out.println("There are: " + even + " even numbers");
    }
}
