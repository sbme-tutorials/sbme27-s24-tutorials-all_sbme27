void setup(){
  size(800, 450);
  Game.P = this;
  Game.setup();
}

void draw(){
  Game.draw();
}

void keyPressed(){
  if (key == ' '){
    Game.unicorn.jump();
  }
}
