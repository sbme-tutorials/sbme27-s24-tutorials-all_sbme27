import processing.core.PApplet;

public class Rain extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Rain");
    }

    private final Droplet[] droplets = new Droplet[500];

    public void settings(){
        size(640, 360);
    }
    public void setup(){
        for(int i = 0; i < 500; i++){
            droplets[i] = new Droplet(this);
        }
    }
    public void draw(){
        background(230, 230, 250);
        for(Droplet d : droplets){
            d.show();
            d.update();
        }
    }
}