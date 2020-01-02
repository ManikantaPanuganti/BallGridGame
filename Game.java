public class Game {
    Ball ball;
    Person person;
    Game(){
        placeBall();
        person = new Person(10);
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
        ballFound=checkIfBallFound(person.getLocation());
        while(!ballFound){
            person.move();
            ballFound=checkIfBallFound(person.getLocation());
        }
    }
}
