package jc.command;

import jc.input.InputHolder;

public class MaxValueCommand extends AbstractCommand<Integer> {

    public MaxValueCommand(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "highest value";
    }

    @Override
    public Integer execute() {
        return input.get().stream().mapToInt(Integer::intValue).max().orElseThrow(() -> new RuntimeException("Unexpected empty list"));
    }
}
