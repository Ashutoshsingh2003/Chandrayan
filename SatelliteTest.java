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

}
