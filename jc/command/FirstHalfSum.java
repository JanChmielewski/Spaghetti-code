package jc.command;

import java.util.List;

public class FirstHalfSum extends AbstractCommand<Integer> {

    public FirstHalfSum(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "sum of first half";
    }

    @Override
    public Integer execute() {
        List<Integer> list = input.get();
        List<Integer> firstHalf = list.subList(0, list.size() / 2);
        return firstHalf.stream().mapToInt(Integer::intValue).sum();
    }
}
