public class Person {
    private Location location;
    int girdEnding=10;
    Person(){
        location=new Location(0,0);
    }

    public Location getLocation() {
        return location;
    }

    void moveRight(){
        this.location.x_coordinate++;
    }
    void moveUp(){
        this.location.y_coordinate++;
    }
    void move(){
        if(this.location.x_coordinate<girdEnding){
            this.moveRight();
        }
        else{
            this.moveUp();
            this.location.x_coordinate=0;
        }
    }

}
