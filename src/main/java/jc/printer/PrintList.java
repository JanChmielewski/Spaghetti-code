package jc.printer;

import jc.command.Command;

import java.util.List;
import java.util.stream.Collectors;

public class PrintList<T> implements PrintCommand {

    private final Command<List<T>> delegate;

    public PrintList(Command<List<T>> delegate) {
        this.delegate = delegate;
    }

    @Override
    public String name() {
        return "print " + delegate.name();
    }

    @Override
    public String execute() {
        return "[" + delegate.execute().stream().map(String::valueOf).collect(Collectors.joining(", ")) + "]";
    }
}
