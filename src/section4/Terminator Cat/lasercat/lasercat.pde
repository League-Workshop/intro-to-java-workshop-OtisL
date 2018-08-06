PImage catPic;
int x = 800;
int y = 441;
int acceleration = 5;
void setup() {
  size(1180, 856);
  catPic = loadImage("cat.jpg");
  catPic.resize(width, height);
  background(catPic);
  noStroke();
}

void draw() {   
  fill(#FF0303);
  ellipse(x, y, 45, 45); 
  fill(#FF0303);
  ellipse(x+115, y, 45, 45);
  if (x > width) {
    background(catPic);
    x = 800;
    y = 441;
    acceleration = 5 ;
  }
} 

void keyPressed() {
  x+=2*acceleration;
  y+=2*acceleration;
}