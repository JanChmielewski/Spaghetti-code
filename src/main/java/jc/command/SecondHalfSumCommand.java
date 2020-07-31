package jc.command;

import jc.input.InputHolder;

import java.util.List;

public class SecondHalfSumCommand extends AbstractCommand<Integer> {

    public SecondHalfSumCommand(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "sum of second half";
    }

    @Override
    public Integer execute() {
        List<Integer> list = input.get();
        List<Integer> secondHalf = list.subList(list.size() / 2, list.size() - list.size() % 2);
        return secondHalf.stream().mapToInt(Integer::intValue).sum();
    }
}
