PImage mustache;
  PImage face;
void setup(){
  size (1200,800);
  face = loadImage("face2.png");
  face.resize(width,height);
  mustache = loadImage("mustache.png");
  mustache.resize(500,200);
}

void draw(){
  background(face);
  if(mousePressed){
    image(mustache, mouseX-200, mouseY-100);
  }

}