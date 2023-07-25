package io.a3ammari.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public record Position(int x, int y, Direction direction) {
    public Position {
        if (x > 5 || x < 1) {
            throw new IllegalArgumentException("x coordinates out of bounds (x = "+x+" )");
        }
        if (y > 5 || y < 1) {
            throw new IllegalArgumentException("y coordinates out of bounds (y = "+y+" )");
        }
    }
}
