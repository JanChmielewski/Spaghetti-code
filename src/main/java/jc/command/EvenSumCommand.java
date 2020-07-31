package jc.command;

import jc.input.InputHolder;

public class EvenSumCommand extends AbstractCommand<Integer> {

    public EvenSumCommand(InputHolder input) {
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
