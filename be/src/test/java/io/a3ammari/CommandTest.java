package io.a3ammari;

import io.a3ammari.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CommandTest {



    @Test
    public void testForwardOutOfBound(){
        Position initial = new Position(0,0,Direction.NORTH);
        Command cmd = new Forward(10);
        Assertions.assertThrows(IllegalArgumentException.class,()->{cmd.execute(initial);});
    }


    @Test
    public void testTurnAround(){
        Position initial = new Position(1,1,Direction.NORTH);
        Command cmd = new TurnAround();
        Position newPosition = cmd.execute(initial);
        Assertions.assertSame(newPosition.direction(),Direction.SOUTH);
    }

    @Test
    public void testForward(){
        Command cmd = new Forward(1);
        Position initial = new Position(1,2,Direction.EAST);
        Position newPosition = cmd.execute(initial);
        Assertions.assertSame(newPosition.direction(),initial.direction());
        Assertions.assertSame(newPosition.x(),2);
        Assertions.assertSame(newPosition.y(),initial.y());
    }
}
