Droplet[] droplets = new Droplet[500];

void setup(){
  size(640, 360);
 //for(Droplet d : droplets){
 //  d = new Droplet();
 //}
 for(int i = 0; i < 500; i++){
   droplets[i] = new Droplet();
 }
}
void draw(){
    background(230, 230, 250);
   for(Droplet d : droplets){
     d.show();
     d.update();
   }
}
