int foodX = 100;
int foodY = 20;
int score = 0;
String winningMessage = "You won fish feeder!!";
int fontSize = 30;
int win = 0;
void setup() {
  size(800, 800);
}

void draw() {
  if (win==0) {
    background(141, 233, 237);
    drawFish();
    fill(#524E23);
    noStroke();
    ellipse(foodX, foodY, 30, 30);
    foodY+=5;
    checkCatch(foodX, foodY);
    if (foodY>height) {
      foodX = (int) random(width-20);
      foodY = 20;              
      ellipse(foodX, foodY, 30, 30);
    }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    if (score==30) {
      win=1;
    }
  } else {
    textSize(fontSize); 
    text(winningMessage, 250, 400);
    textSize(fontSize); 
    text("GREAT JOB PLAYER!!!", 250, 450);
    textSize(fontSize); 
    text("Now try some of the other games", 250, 500);
  }
}

void drawFish() {
  noStroke();
  fill(255, 255, 255);
  ellipse(mouseX-17, mouseY-17, 20, 20); //back side eye
  fill(255, 200, 88);
  ellipse(mouseX, mouseY, 90, 50); //body
  triangle(mouseX+30, mouseY, mouseX+70, mouseY+30, mouseX+70, mouseY-30); //tail
  stroke(0);
  triangle(mouseX, mouseY, mouseX+15, mouseY+10, mouseX+15, mouseY-10); //side fin
  noStroke();
  fill(255, 200, 88);
  ellipse(mouseX, mouseY, 15, 15); //side fin cover
  noStroke();
  fill(255, 255, 255);
  ellipse(mouseX-25, mouseY-15, 20, 20); //front eye
  fill(0, 0, 0);
  ellipse(mouseX-25, mouseY-15, 5, 5); //pupil
  fill(141, 233, 237);
  ellipse(mouseX-45, mouseY, 25, 25); //mouth
}

void checkCatch(int x, int y) {
  if (x > mouseX && x < mouseX+70) {
    if (y > mouseY-17 && y < mouseY+30) {
      score++;
      foodY = 20; //if the food was eaten, make more food fall from the top
      foodX = (int) random(width-20);
    }
  } else if (foodY > height && score > 0) {
    score--;
  }
}