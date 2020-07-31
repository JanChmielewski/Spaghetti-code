package jc.printer;

import jc.command.Command;

public class PrintInteger implements PrintCommand {

    private final Command<Integer> delegate;

    public PrintInteger(Command<Integer> delegate) {
        this.delegate = delegate;
    }

    @Override
    public String name() {
        return "print " + delegate.name();
    }

    @Override
    public String execute() {
        return String.valueOf(delegate.execute());
    }
}
