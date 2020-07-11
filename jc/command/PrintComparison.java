package jc.command;

public class PrintComparison implements PrintCommand {

    private final Command<ComparisionEnum> delegate;
    private final String lhs;
    private final String rhs;

    public PrintComparison(Command<ComparisionEnum> delegate, String lhs, String rhs) {
        this.delegate = delegate;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public String name() {
        return "print " + delegate.name();
    }

    @Override
    public String execute() {
        return delegate.execute().verdict(lhs, rhs);
    }
}
