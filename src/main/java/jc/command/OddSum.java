package jc.command;

import java.util.List;

public class OddSum  extends AbstractCommand<Integer> {

    public OddSum(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "count of odd values";
    }

    @Override
    public Integer execute() {
        return input.get().stream().mapToInt(Integer::intValue).reduce(0, (left, right) -> right % 2 == 1 ? left + 1 : left);
    }
}
