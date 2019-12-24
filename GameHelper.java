import java.util.*;
public class GameHelper{
  Location ball;
  Location person;
  GameHelper(){
    ball=new Location((int)(Math.random()*10),(int)(Math.random()*10));
    person=new Location(0,0);
    System.out.println("Ball Placed at Location: "+ball.x+" "+ball.y);
  }
  //THis is a brutForce solution
  void runGame(){

    //x dirextioj moving
    while(person.x<ball.x){
      System.out.println("moved in x direction "+person.x+" "+person.y);
      person.x++;
    }
    System.out.println("moved in x direction "+person.x+" "+person.y);
    while(person.y<ball.x){
      System.out.println("moved in y direction "+person.x+" "+person.y);
      person.y++;
    }
    System.out.println("moved in y direction "+person.x+" "+person.y);
  }
  public static void main(String[] args){
    GameHelper g=new GameHelper();
    g.runGame();
  }
}
