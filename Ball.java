public class Ball {
    private Location location;

    Ball(int x_coordinate,int y_coordinate){
        location=new Location(x_coordinate,y_coordinate);
    }

    Location getLocation(){
        return location;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "location=" + location +
                '}';
    }
}
