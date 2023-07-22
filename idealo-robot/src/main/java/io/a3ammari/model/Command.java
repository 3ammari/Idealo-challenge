package io.a3ammari.model;



public sealed interface Command permits Init,Forward,TurnAround,Wait,Right,Left {
    Position execute(Position position);

    static Command parse(String s){
        var parts = s.split(" ");
        return switch (parts[0]){
            case "POSITION" -> new Init(
                    new Position(
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2]),
                            Direction.valueOf(parts[3])
                    )
            );
            case "FORWARD" -> new Forward(Integer.parseInt(parts[1]));
            case "WAIT" -> new Wait();
            case "TURNAROUND" -> new TurnAround();
            case "LEFT" -> new Left();
            case "RIGHT" -> new Right();
            default -> throw new IllegalArgumentException("Unexpected value: " + s);
        };
    }
}


