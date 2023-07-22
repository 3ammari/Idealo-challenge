package io.a3ammari.model;



public sealed interface Command permits Init,Forward,TurnAround,Wait,Right,Left {
    Position execute(Position position);
}


