import processing.core.PApplet;

import java.util.Scanner;

class Droplet {
    private float x, y, z, len, ySpeed, thick, yGravity;
    PApplet parent;
    public Droplet(PApplet parent) {
        this.parent = parent;
        this.initialize_values();

    }

    private void initialize_values(){
        Scanner sc = new Scanner(System.in);
        x = parent.random(parent.width);
        y = parent.random(-500, -50);
        z = parent.random(0, 20);
        len = PApplet.map(z, 0, 20, 10, 20);
        ySpeed = PApplet.map(z, 0, 20, 1, 20);
        thick = PApplet.map(z, 0, 20, 1, 3);
        yGravity = PApplet.map(z, 0, 20, 0, (float) 0.2);
    }
    public void update(){
        y += ySpeed;
        ySpeed += yGravity;

        if(y > parent.height){
            this.initialize_values();
        }
    }

    public void show(){
        parent.strokeWeight(thick);
        parent.stroke(138, 43, 226);
        parent.line(x, y, x, y+len);
    }
}