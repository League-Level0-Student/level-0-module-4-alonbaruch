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

if(isNear(x,mouseX)&&isNear(y, mouseY)){
  fill(#00F71E);
ellipse(mouseX,mouseY,20,20);
text("You found the creeper",245,245);
textSize(100);
}
else{
   fill(#E02424);
  ellipse(mouseX,mouseY,20,20);
}
}

}
boolean isNear(int x, int y) {
if (abs(x - y) < 10)
     return true;
else
     return false;

}
