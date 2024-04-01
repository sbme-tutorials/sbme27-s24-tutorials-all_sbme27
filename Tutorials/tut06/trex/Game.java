import processing.core.*;
import processing.core.PApplet;
import java.util.*;

class Game{
  static PApplet P;
  static Unicorn unicorn;
  static PImage background_image;
  static List<Train> trains = new ArrayList<Train>();
  
  static void setup(){
    unicorn = new Unicorn();
    background_image = P.loadImage("src/background.jpg");
  }
  
  static void draw(){
    if(P.random(1) < 0.01){
      trains.add(new Train());
    }
    
    P.background(background_image);
    unicorn.show();
    unicorn.move();
    
    for(var train : trains){
      train.show();
      train.move();
    }   
  }  
}
