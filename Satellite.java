/**
 * Satellite
 */
class Directory {
    int x,y,z ;
    String direction ;
    public Directory(int x , int y , int z , String direction){
         this.x=x;
         this.y=y;
         this.z=z;
         this.direction = direction ;
    }

      public void forward() {
        if (direction.equals("N")) {
            y++;
        } else if (direction.equals("S")) {
            y--;
        } else if (direction.equals("E")) {
            x++;
        } else if (direction.equals("W")) {
            x--;
        } else if (direction.equals("Up")) {
            z++;
        } else if (direction.equals("Down")) {
            z--;
        }
    }

    public void backward() {
        if (direction.equals("N")) {
            y--;
        } else if (direction.equals("S")) {
            y++;
        } else if (direction.equals("E")) {
            x--;
        } else if (direction.equals("W")) {
            x++;
        } else if (direction.equals("Up")) {
            z--;
        } else if (direction.equals("Down")) {
            z++;
        }
    }


}
public class Satellite {

    public static void main(String[] args) {
        int[] startingPosition = {0,0,0};
        String startingDirection = "N";
        Directory dir = new Directory(startingPosition[0] , startingPosition[1], startingPosition[2] , startingDirection);
    }
}
