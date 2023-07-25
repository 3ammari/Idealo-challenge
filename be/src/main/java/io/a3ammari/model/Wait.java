package io.a3ammari.model;

public record Wait() implements Command {

    @Override
    public Position execute(Position position) {
        return position;
    }
}
