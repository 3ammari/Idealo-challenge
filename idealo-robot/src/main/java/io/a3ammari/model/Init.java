package io.a3ammari.model;

public record Init(Position initial) implements Command{
    @Override
    public Position execute(Position position) {
        return initial;
    }
}