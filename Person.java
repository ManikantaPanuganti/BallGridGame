public class Person {
    private Location location;
    int girdEnding;
    Person(int gridEnding){
        this.location=new Location(0,0);
        this.girdEnding=gridEnding;
    }

    public Location getLocation() {
        return location;
    }
    void moveLeft(){
        this.location.decrease_Y_coordinate();
    }
    void moveRight(){
        this.location=location.increase_X_coordinate();
    }
    void moveUp(){
        this.location=location.increase_Y_coordinate();
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
