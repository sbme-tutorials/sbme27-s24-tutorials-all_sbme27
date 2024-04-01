import processing.core.*;

class Unicorn{

  float r = 150;
  float x = 50;
  float y = Game.P.height - r;
  float vy = 0;
  double gravity = 0.5;
  PImage unicorn_image = Game.P.loadImage("src/unicorn.png");
  
  Unicorn(){
  }
  
  void jump(){
    this.vy = -5;
    
  }
  
  void move(){
    this.y += this.vy;
    this.vy += this.gravity;
    this.y = PApplet.constrain(this.y, 0, Game.P.height - r);
  }
  
  void show(){
    Game.P.image(this.unicorn_image, this.x, this.y, this.r, this.r);
    //Game.P.rect(this.x, this.y, 50, 50);
  }
}
