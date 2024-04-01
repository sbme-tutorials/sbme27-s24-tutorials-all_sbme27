import processing.core.*;
import processing.core.PApplet;

class Train{
  float r = 100;
  float x = Game.P.width - 100;
  float y = Game.P.height - this.r;
  PImage train_image = Game.P.loadImage("src/train.png");

  Train(){}
  void move(){
    this.x -= 3;
  }
  
  void show(){
    //Game.P.rect(x, 100, 50, 50);
    Game.P.image(this.train_image, this.x, this.y, this.r, this.r);
  }
}
