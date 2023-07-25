package io.a3ammari.model;

public record Forward(int steps) implements Command {
    @Override
    public Position execute(Position position) {
        return switch (position.direction()) {
            case NORTH -> new Position(position.x(), position.y() - steps, position.direction());
            case SOUTH -> new Position(position.x(), position.y() + steps, position.direction());
            case EAST -> new Position(position.x() + steps, position.y(), position.direction());
            case WEST -> new Position(position.x() - steps, position.y(), position.direction());
        };
    }
}
