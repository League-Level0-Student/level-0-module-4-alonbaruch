PImage donkey;
PImage tail;
void setup(){
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
  background (donkey);
image(tail, mouseX, mouseY);
size(800, 590);     //replace width, height with your picture's dimensions
tail.resize(150, 200);     //replace width, height with your tail's dimensions
image(tail, mouseX-10, mouseY-20);
}
void draw(){
  background (#000000);
image(tail, mouseX, mouseY);
rect(0, 0, 30, 30);
fill(#000000);
rect(700, 245, 40, 40);
fill(#000000);
if(dist(0, 0, mouseX, mouseY) < 30){
  background(donkey);
}
if(dist(700, 245, mouseX, mouseY) < 30){
  background(donkey);

}

}
void playWoohoo() {
 woohoo.stop();
     woohoo.trigger();
   
}
