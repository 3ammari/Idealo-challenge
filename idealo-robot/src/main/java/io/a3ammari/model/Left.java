package io.a3ammari.model;

public record Left() implements Command {
    @Override
    public Position execute(Position position) {
        return switch (position.direction()) {
            case NORTH -> new Position(position.x(), position.y(), Direction.WEST);
            case SOUTH -> new Position(position.x(), position.y(), Direction.EAST);
            case EAST -> new Position(position.x(), position.y(), Direction.NORTH);
            case WEST -> new Position(position.x(), position.y(), Direction.SOUTH);
        };
    }
}
