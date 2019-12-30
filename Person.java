public class Person {
    Location location;
    Person(){
        location=new Location(0,0);
    }
    void move_in_x_direction(int steps){
        this.location.x_coordinate+=steps;
    }
    void move_in_y_direction(int steps){
        this.location.y_coordinate+=steps;
    }
}
