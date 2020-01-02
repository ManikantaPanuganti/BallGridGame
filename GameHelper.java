public class GameHelper {
    Ball ball;
    Person person;
    GameHelper(){
        placeBall();
        person = new Person();
    }

    void  placeBall(){
        ball=new Ball((int)(Math.random()*10),(int)(Math.random()*10));
    }

    boolean checkIfBallFound(Location location){
        if(location.sameLocation(ball.getLocation())){
            System.out.println("Ball Found "+person.getLocation());
            return true;
        }
        else{
            return false;
        }
    }

    void findBall(){
        boolean ballFound=false;
        while(!ballFound){
            person.move();
            ballFound=checkIfBallFound(person.getLocation());
        }
    }
}
