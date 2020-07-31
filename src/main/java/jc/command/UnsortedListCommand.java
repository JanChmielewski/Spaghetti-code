package jc.command;

import jc.input.InputHolder;

import java.util.List;

public class UnsortedListCommand extends AbstractCommand<List<Integer>> {

    public UnsortedListCommand(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "unsorted list";
    }

    @Override
    public List<Integer> execute() {
        return input.get();
    }

}
