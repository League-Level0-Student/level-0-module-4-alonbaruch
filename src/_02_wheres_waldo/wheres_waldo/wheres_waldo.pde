

void setup() {
  PImage waldo = loadImage("waldo.jpeg"); // Change this to match your file name.
  size(1500, 1000);
  image(waldo, 0, 0);
  doh = minim.loadSample("doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo


      // If the mouse is on Waldo, print “Waldo found!”
if(mouseX<1276&&mouseX>1256&&mouseY>82&&mouseY<100){
  print("waldo found");
playWoohoo();
}
if(mousePressed){
 playDoh(); 
}
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 


void playWoohoo() {
 woohoo.stop();
     woohoo.trigger();
   
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
