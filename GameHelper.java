import java.util.*;
public class GameHelper{
  Location ball;
  GameHelper(){
    ball=new Location((int)(Math.random()*10),(int)(Math.random()*10));
    System.out.println("Ball Placed at Location: "+ball.x+" "+ball.y);
  }
  //THis is a brutForce solution
  void runGame(){
    int x=0;
    int y=0;
    //x dirextioj moving
    while(x<=ball.x){
      System.out.println("ball moved in x direction "+x+" "+y);
      x++;
    }

    while(y<=ball.x){
      System.out.println("ball moved in y direction "+x+" "+y);
      y++;
    }
  }
  public static void main(String[] args){
    GameHelper g=new GameHelper();
    g.runGame();
  }
}
