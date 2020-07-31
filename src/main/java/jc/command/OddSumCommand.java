package jc.command;

import jc.input.InputHolder;

public class OddSumCommand extends AbstractCommand<Integer> {

    public OddSumCommand(InputHolder input) {
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
