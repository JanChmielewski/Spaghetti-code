package jc.command;

public enum ComparisionEnum {
    EVEN("="), GT(">"), LT("<");

    private final String symbol;

    ComparisionEnum(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static ComparisionEnum compare(Integer lhs, Integer rhs) {
        if (lhs.compareTo(rhs) > 0) {
            return GT;
        } else if (lhs.compareTo(rhs) < 0) {
            return LT;
        } else {
            return EVEN;
        }
    }
}
