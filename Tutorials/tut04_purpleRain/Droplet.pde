class Droplet{

  float x = random(width);
  float y = random(-500, -50);
  float z = random(0, 20);
  
  float len = map(z, 0, 20, 10, 20);
  float ySpeed = map(z, 0, 20, 1, 20);
  float thick = map(z, 0, 20, 1, 3);
  float yGravity = map(z, 0, 20, 0, 0.2);
  
  void update(){
    y += ySpeed;
    ySpeed += yGravity;
    
    if(y > height){
      y = random(-500, -50);
      len = map(z, 0, 20, 10, 20);
      ySpeed = map(z, 0, 20, 1, 20);
      thick = map(z, 0, 20, 1, 3);
      yGravity = map(z, 0, 20, 0, 0.2);
    }
  }
  
  void show(){
    strokeWeight(thick);
    stroke(138, 43, 226);
    line(x, y, x, y+len);
  }
}
