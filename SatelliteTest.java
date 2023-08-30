import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SatelliteTest {
       
    @Test
    public void startingPositionandDirection()
    {
        Directory dir = new Directory(0 , 0 ,0, "N");
        assertTrue((dir.direction.equals("N" )) && (dir.x==0)&& (dir.y==0)&&(dir.z==0));
        

    }
}
