public class GameHelper {
    Ball ball;
    Person person;
    GameHelper(){
        ball=new Ball((int)(Math.random()*10),(int)(Math.random()*10));
        System.out.println("Ball is at:"+ball);
        person = new Person();
    }

    void findPath(){
        int step=1;
        int backwordStep=-1;
        boolean pathFound=false;
        while(!pathFound){
            //person moving in x direction forward
            while(person.location.x_coordinate<=10 && !pathFound) {
                person.move_in_x_direction(step);
                pathFound = checkIfBallFound(person.location);
            }
            if(person.location.y_coordinate<=10){
                person.location.y_coordinate++;
            }
            //person moving in x direction back word
            while(person.location.x_coordinate>=0 && !pathFound) {
                person.move_in_x_direction(backwordStep);
                pathFound = checkIfBallFound(person.location);
            }
        }
        if(pathFound){
            System.out.println("Path Found "+person.location);
        }
        else{
            System.out.println("ball not found");
        }
    }

    boolean checkIfBallFound(Location location){

        if(location.x_coordinate==ball.location.x_coordinate && location.y_coordinate==ball.location.y_coordinate){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        GameHelper gameHelper =new GameHelper();
        gameHelper.findPath();

    }
}
