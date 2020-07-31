package jc.command;

import jc.input.InputHolder;

public abstract class AbstractCommand<T> implements Command<T> {

    protected final InputHolder input;

    public AbstractCommand(InputHolder input) {
        this.input = input;
    }
}
