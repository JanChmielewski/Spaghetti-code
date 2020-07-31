package jc.input;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputHolder implements Supplier<List<Integer>> {

    private final int[] input;

    public InputHolder(int[] input) {
        this.input = input;
    }

    public static InputHolder from(InputProvider inputProvider) {
        return new InputHolder(inputProvider.getList());
    }

    @Override
    public List<Integer> get() {
        return IntStream.of(input).boxed().collect(Collectors.toList());
    }
}
