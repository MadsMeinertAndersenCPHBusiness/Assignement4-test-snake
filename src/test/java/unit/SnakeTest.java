package unit;

import Snake.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EventListener;
import java.util.Vector;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SnakeTest {

    @Test
    void mustMoveLeftWhenPressingLeft(){
        //Act
        Snake snake = new SnakeImpl("A");
        //Arrange
        snake.move("A");
        //Assert
        assertEquals(snake, "A");
    }
}
