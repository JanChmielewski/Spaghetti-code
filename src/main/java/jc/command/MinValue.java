package jc.command;

import java.util.List;

public class MinValue  extends AbstractCommand<Integer> {

    public MinValue(InputHolder input) {
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
