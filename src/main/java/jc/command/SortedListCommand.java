package jc.command;

import jc.input.InputHolder;

import java.util.List;

public class SortedListCommand extends AbstractCommand<List<Integer>> {

    public SortedListCommand(InputHolder input) {
        super(input);
    }

    @Override
    public String name() {
        return "sorted list";
    }

    @Override
    public List<Integer> execute() {
        List<Integer> list = input.get();
        bubbleSort(list);
        return list;
    }

    private void bubbleSort(List<Integer> unseortedInput) {
        for (int i = 0; i < unseortedInput.size(); i++) {
            for (int j = 0; j < unseortedInput.size() - 1; j++) {
                if (unseortedInput.get(j) > unseortedInput.get(j + 1)) {
                    int temp = unseortedInput.get(j + 1);
                    unseortedInput.set(j + 1, unseortedInput.get(j));
                    unseortedInput.set(j, temp);
                }
            }
        }
    }
}
