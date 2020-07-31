package jc;

import jc.command.Command;
import jc.command.EvenSumCommand;
import jc.command.FirstHalfSumCommand;
import jc.command.HalvesComparatorCommand;
import jc.command.MaxValueCommand;
import jc.command.MinValueCommand;
import jc.command.OddSumCommand;
import jc.command.SecondHalfSumCommand;
import jc.command.SortedListCommand;
import jc.command.UnsortedListCommand;
import jc.input.InputHolder;
import jc.input.InputProvider;
import jc.printer.PrintComparison;
import jc.printer.PrintInteger;
import jc.printer.PrintList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperationList {

    private final List<Command<String>> commands;

    public OperationList(InputProvider inputProvider) {

        InputHolder input = InputHolder.from(inputProvider);

        this.commands = Stream.of(
                new PrintList<>(new UnsortedListCommand(input)),
                new PrintList<>(new SortedListCommand(input)),
                new PrintInteger(new MinValueCommand(input)),
                new PrintInteger(new MaxValueCommand(input)),
                new PrintInteger(new OddSumCommand(input)),
                new PrintInteger(new EvenSumCommand(input)),
                new PrintInteger(new FirstHalfSumCommand(input)),
                new PrintInteger(new SecondHalfSumCommand(input)),
                new PrintComparison(new HalvesComparatorCommand(input), "first half", "second half")
        ).collect(Collectors.toList());
    }

    public String listAll() {
        StringBuilder sb = new StringBuilder("The list of thing I can do\n");
        for (int i = 0; i < commands.size(); i++) {
            String name = commands.get(i).name();
            sb.append("\t")
                    .append(i + 1)
                    .append(". ")
                    .append(name.substring(0, 1).toUpperCase())
                    .append(name.substring(1))
                    .append("\n");
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
