package jc.command;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputHolder {

    private final int[] input;
    private List<Integer> cached;

    public InputHolder(int[] input) {
        this.input = input;
    }

    public List<Integer> get() {
        if (cached == null) {
            cached = IntStream.of(input).boxed().collect(Collectors.toList());
        }
        return cached;
    }
}
