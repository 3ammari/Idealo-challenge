package io.a3ammari.model;

public record Right() implements Command {
    @Override
    public Position execute(Position position) {
        return switch (position.direction()) {
            case NORTH -> new Position(position.x(), position.y(), Direction.EAST);
            case SOUTH -> new Position(position.x(), position.y(), Direction.WEST);
            case EAST -> new Position(position.x(), position.y(), Direction.SOUTH);
            case WEST -> new Position(position.x(), position.y(), Direction.NORTH);
        };
    }
}
