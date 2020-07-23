package jc.command;

public abstract class AbstractCommand<T> implements Command<T> {

    protected final InputHolder input;

    public AbstractCommand(InputHolder input) {
        this.input = input;
    }
}
