import processing.core.PApplet;
public class Main extends PApplet{
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings(){
        this.size(600, 600);

    }

    public void setup(){}
    public void draw(){
        this.background(255, 0, 0);
        this.rect(250, 250, 100, 100);
    }

    public void mousePressed(){
        if (this.mouseButton == PApplet.LEFT) {
            this.fill(0);
        } else if (this.mouseButton == PApplet.RIGHT) {
            this.fill(255);
        } else {
            this.fill(126);
        }
    }
}