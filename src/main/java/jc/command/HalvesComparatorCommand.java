package jc.command;

import jc.input.InputHolder;

public class HalvesComparatorCommand extends AbstractCommand<ComparisionEnum> {

    public HalvesComparatorCommand(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "comparison of both halves";
    }

    @Override
    public ComparisionEnum execute() {
        Integer firstHalf = new FirstHalfSumCommand(input).execute();
        Integer secondHalf = new SecondHalfSumCommand(input).execute();

        return ComparisionEnum.compare(firstHalf, secondHalf);
    }
}
