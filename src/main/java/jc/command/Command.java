package jc.command;

public interface Command<T> {

    String name();

    T execute();

}
