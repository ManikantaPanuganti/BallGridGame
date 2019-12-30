public class GameHelper {
    static void findPath(Ball ball,Person person){
        //moving in X_direction
        int x_Direction_steps,y_Direction_steps;
        x_Direction_steps=ball.location.x_coordinate-person.location.x_coordinate;
        y_Direction_steps=ball.location.y_coordinate-person.location.y_coordinate;
        person.location.x_coordinate+=x_Direction_steps;
        System.out.println("Person moved in X_direction "+x_Direction_steps+" steps and he is at "+person.location.x_coordinate+" "+person.location.y_coordinate);
        person.location.y_coordinate+=y_Direction_steps;
        System.out.println("Person moved in Y_direction "+y_Direction_steps+" steps and he is at "+person.location.x_coordinate+" "+person.location.y_coordinate);
    }
    public static void main(String[] args){
        int x_coordinate,y_coordinate;
        x_coordinate= (int)(Math.random()*10);
        y_coordinate= (int)(Math.random()*10);
        Ball ball=new Ball(x_coordinate,y_coordinate);
        System.out.println("Ball is at:"+ball.location.x_coordinate+" "+ball.location.y_coordinate);
        Person person=new Person();
        findPath(ball,person);
    }
}
