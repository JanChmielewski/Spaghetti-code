package jc.command;

public class MaxValue extends AbstractCommand<Integer> {

    public MaxValue(InputHolder input) {
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
