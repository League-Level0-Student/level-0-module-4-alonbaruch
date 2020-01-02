PImage creeper;
int x = 1000;
int y = 500;
void setup() {
  size(1836,1032);
PImage minecraft = loadImage("minecraft.jpg");     //in setup method
minecraft.resize(1836, 1032);          //in setup method
background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");     //in setup method
creeper.resize(20, 20);     //in setup method
}

void draw() {
image(creeper, x, y);     //in draw method
if(mousePressed){
  ellipse(mouseX,mouseY,20,20);
fill(#E02424);

}

}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;

}
