PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(1000, 1000);     //replace width, height with your picture's dimensions
}

void draw() {
  background (donkey);
image(tail, mouseX, mouseY);
tail.resize(500, 200);     //replace width, height with your tail's dimensions
image(tail, mouseX-10, mouseY-20);
rect(0, 0, 30, 30);
rect(454, 75, 40, 40);
dist(3, 2, mouseX, mouseY) < 30
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
