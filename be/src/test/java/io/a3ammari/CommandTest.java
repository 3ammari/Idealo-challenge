package io.a3ammari;

import io.a3ammari.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CommandTest {



    @Test
    public void testForwardOutOfBound(){
        Position initial = new Position(1,1,Direction.NORTH);
        Command tenStepForward = new Forward(10);
        Assertions.assertThrows(IllegalArgumentException.class,()->{tenStepForward.execute(initial);},"Should fail to move Forward 10 steps");
        Position facingEdge = new Position(5,1,Direction.EAST);
        Command oneStepForward = new Forward(1);
        Assertions.assertThrows(IllegalArgumentException.class,()-> oneStepForward.execute(facingEdge),"Should fail to move Forward 1 step from edge");
    }


    @Test
    public void testTurnAround(){
        Position initial = new Position(1,5,Direction.NORTH);
        Command cmd = new TurnAround();
        Position newPosition = cmd.execute(initial);
        Assertions.assertSame(initial.y(),newPosition.y(),"Asserting y axis");
        Assertions.assertSame(initial.x(),newPosition.x(),"Asserting x axis");
        Assertions.assertSame(newPosition.direction(),Direction.SOUTH);
    }

    @Test
    public void testForward(){
        Command cmd = new Forward(1);
        Position initial = new Position(1,2,Direction.EAST);
        Position newPosition = cmd.execute(initial);
        Assertions.assertSame(newPosition.direction(),initial.direction(),"move Forward should not change Direction should not change");
        Assertions.assertSame(newPosition.x(),2,"while facing EAST FORWARD 1 step should increment x axis by 1");
        Assertions.assertSame(newPosition.y(),initial.y(),"while facing EAST FORWARD 1 step should not change y axis");
    }
}
