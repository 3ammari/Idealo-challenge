package io.a3ammari.model;

public record Position(int x, int y, Direction direction) {
    public Position(int x, int y, Direction direction) {
        if (x > 5 || x < 0) {
            throw new IllegalArgumentException("x coordinates out of bounds");
        }
        if (y > 5 || y < 0) {
            throw new IllegalArgumentException("y coordinates out of bounds");
        }
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
