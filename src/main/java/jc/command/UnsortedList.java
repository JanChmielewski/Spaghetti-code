package jc.command;

import java.util.List;

public class UnsortedList extends AbstractCommand<List<Integer>> {

    public UnsortedList(InputHolder input) {
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
