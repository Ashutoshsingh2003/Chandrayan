import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SatelliteTest {
       
    @Test
    public void startingPositionandDirection()
    {
        Directory dir = new Directory(0 , 0 ,0, "N");
        assertTrue((dir.direction.equals("N" )) && (dir.x==0)&& (dir.y==0)&&(dir.z==0));
        
    }
     @Test
    public void testMoveForward() {
        Directory dir = new Directory(0, 0, 0, "N");
        dir.forward();

        assertEquals(0, dir.x);
        assertEquals(1, dir.y);
        assertEquals(0, dir.z);
        assertEquals("N", dir.direction);
    }
    @Test
    public void testMoveBackward() {
        Directory dir = new Directory(0, 0, 0, "N");
        dir.backward();

        assertEquals(0, dir.x);
        assertEquals(-1, dir.y);
        assertEquals(0, dir.z);
        assertEquals("N", dir.direction);
    }
    @Test
    public void testTurnLeft() {
        Directory dir = new Directory(0, 0, 0, "N");
        dir.left();

        assertEquals(0, dir.x);
        assertEquals(0, dir.y);
        assertEquals(0, dir.z);
        assertEquals("W", dir.direction);
    }
    @Test
    public void testTurnRight() {
        Directory dir = new Directory(0, 0, 0, "N");
        dir.right();

        assertEquals(0, dir.x);
        assertEquals(0, dir.y);
        assertEquals(0, dir.z);
        assertEquals("E", dir.direction);
    }

    @Test
    public void testTurnUp() {
        Directory dir = new Directory(0, 0, 0, "N");
        dir.turningupside();

        assertEquals(0, dir.x);
        assertEquals(0, dir.y);
        assertEquals(0, dir.z);
        assertEquals("Up", dir.direction);
    }
     @Test
    public void testTurnUpchangeIndirection() {
        Directory dir = new Directory(0, 0, 0, "E");
        dir.turningupside();

        assertEquals(0, dir.x);
        assertEquals(0, dir.y);
        assertEquals(0, dir.z);
        assertEquals("Up", dir.direction);
    }

    

}
