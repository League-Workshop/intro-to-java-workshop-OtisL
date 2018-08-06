PImage rainbow;
  PImage unicorn;
void setup(){
  size(800,600);
  rainbow = loadImage("rainbow.jpg");
  rainbow.resize(width,height);
  unicorn = loadImage("unicorn.png");
  unicorn.resize(100,100);
  background(rainbow);

}

void draw(){
  background(rainbow);
  image(unicorn, mouseX, mouseY);
  
}