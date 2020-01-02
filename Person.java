public class Person {
    private Location location;
    int girdEnding=10;
    Person(){
        location=new Location(0,0);
    }

    public Location getLocation() {
        return location;
    }
    void moveLeft(){

    }
    void moveRight(){
        location.increase_X_coordinate();
    }
    void moveUp(){
        location.increase_Y_coordinate();
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
