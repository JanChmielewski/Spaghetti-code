package jc;

import jc.command.Command;
import jc.command.EvenSum;
import jc.command.FirstHalfSum;
import jc.command.HalvesComparator;
import jc.command.InputHolder;
import jc.command.MaxValue;
import jc.command.MinValue;
import jc.command.OddSum;
import jc.command.PrintComparison;
import jc.command.PrintInteger;
import jc.command.PrintList;
import jc.command.SecondHalfSum;
import jc.command.SortedList;
import jc.command.UnsortedList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationList {

    private final List<Command<String>> commands;

    public OperationList(int[] input) {

        this.commands = Stream.of(
                new PrintList<>(new UnsortedList(new InputHolder(input))),
                new PrintList<>(new SortedList(new InputHolder(input))),
                new PrintInteger(new MinValue(new InputHolder(input))),
                new PrintInteger(new MaxValue(new InputHolder(input))),
                new PrintInteger(new OddSum(new InputHolder(input))),
                new PrintInteger(new EvenSum(new InputHolder(input))),
                new PrintInteger(new FirstHalfSum(new InputHolder(input))),
                new PrintInteger(new SecondHalfSum(new InputHolder(input))),
                new PrintComparison(new HalvesComparator(new InputHolder(input)), "first half", "second half")
        ).collect(Collectors.toList());
    }

    public String listAll() {
        StringBuilder sb = new StringBuilder("The list of thing I can do\n");
        for (int i = 0; i < commands.size(); i++) {
            String name = commands.get(i).name();
            sb.append("\t").append(i + 1).append(". ").append(name.replaceFirst(".", name.substring(0, 1).toUpperCase())).append("\n");
        }
        return sb.toString();
    }

    public Optional<String> execute(int option) {
        if (option > commands.size()) {
            return Optional.empty();
        }

        return Optional.of(commands.get(option - 1).execute());
    }
}
