package jc.command;

import java.util.List;

public class EvenSum extends AbstractCommand<Integer> {

    public EvenSum(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "count of even values";
    }

    @Override
    public Integer execute() {
        return input.get().stream().mapToInt(Integer::intValue).reduce(0, (left, right) -> right % 2 == 0 ? left + 1 : left);
    }
}
