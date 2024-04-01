void settings(){
  size(600, 600);
  
}

void setup(){}
void draw(){
  background(255, 0, 0);
  rect(250, 250, 100, 100);
}

void mousePressed(){
  if (mouseButton == LEFT) {
    fill(0);
  } else if (mouseButton == RIGHT) {
    fill(255);
  } else {
    fill(126);
  }
}
