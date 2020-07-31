package jc.command;

import jc.input.InputHolder;

public class MinValueCommand extends AbstractCommand<Integer> {

    public MinValueCommand(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "lowest value";
    }

    @Override
    public Integer execute() {
        return input.get().stream().mapToInt(Integer::intValue).min().orElseThrow(() -> new RuntimeException("Unexpected empty list"));
    }
}
