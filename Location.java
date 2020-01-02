public class Location {
    int x_coordinate;
    int y_coordinate;

    Location(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }
    Location increase_X_coordinate(){
        x_coordinate++;
        return new Location(this.x_coordinate,this.y_coordinate);
    }
    Location decrease_X_coordinate(){
        x_coordinate--;
        return new Location(this.x_coordinate,this.y_coordinate);
    }
    Location increase_Y_coordinate(){
        y_coordinate++;
        return new Location(this.x_coordinate,this.y_coordinate);
    }
    Location decrease_Y_coordinate(){
        return new Location(this.x_coordinate,this.y_coordinate);
    }
    boolean sameLocation(Location secondLocation){
        if(this.x_coordinate==secondLocation.x_coordinate && this.y_coordinate==secondLocation.y_coordinate){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Location{" +
                "x_coordinate=" + x_coordinate +
                ", y_coordinate=" + y_coordinate +
                '}';
    }
}
