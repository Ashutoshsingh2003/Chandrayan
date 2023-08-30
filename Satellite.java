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
     public void left() {
        if (direction.equals("N")) {
            direction = "W";
        } else if (direction.equals("S")) {
            direction = "E";
        } else if (direction.equals("E")) {
            direction = "N";
        } else if (direction.equals("W")) {
            direction = "S";
        }
    }
     public void right() {
        if (direction.equals("N")) {
            direction = "E";
        } else if (direction.equals("S")) {
            direction = "W";
        } else if (direction.equals("E")) {
            direction = "S";
        } else if (direction.equals("W")) {
            direction = "N";
        }
    }
     public void turningupside() {
        if (direction.equals("N") || direction.equals("E")) {
            direction = "Up";
        } else if (direction.equals("S") || direction.equals("W")) {
            direction = "Down";
        }
    }
    
    public void turningdownside() {
        if (direction.equals("N") || direction.equals("E")) {
            direction = "Down";
        } else if (direction.equals("S") || direction.equals("W")) {
            direction = "Up";
        }
    }



}
public class Satellite {

    public static void main(String[] args) {
        int[] startingPosition = {0,0,0};
        String startingDirection = "N";
        String[] commands = {"f", "r", "u", "b", "l"};

        Directory dir = new Directory(startingPosition[0] , startingPosition[1], startingPosition[2] , startingDirection);
        for (String command : commands) {
            switch (command) {
                case "f":
                    dir.forward();
                    break;
                case "b":
                    dir.backward();
                    break;
                case "l":
                    dir.left();
                    break;
                case "r":
                    dir.right();
                    break;
                case "u":
                    dir.turningupside();
                    break;
                case "d":
                    dir.turningdownside();
                    break;
            }
        }
        int lastX = dir.x;
        int lastY = dir.y;
        int lastZ = dir.z;
        String lastDirection = dir.direction;

        System.out.println("Last Position: (" + lastX + ", " + lastY + ", " + lastZ + ")");
        System.out.println("Last Direction: " + lastDirection);



    }
}
