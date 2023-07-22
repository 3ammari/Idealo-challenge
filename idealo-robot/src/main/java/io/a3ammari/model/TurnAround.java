package io.a3ammari.model;

public record TurnAround() implements Command {
    @Override
    public Position execute(Position position) {
        return switch (position.direction()) {
            case NORTH -> new Position(position.x(), position.y(), Direction.SOUTH);
            case SOUTH -> new Position(position.x(), position.y(), Direction.NORTH);
            case EAST -> new Position(position.x(), position.y(), Direction.WEST);
            case WEST -> new Position(position.x(), position.y(), Direction.EAST);
        };
    }
}
