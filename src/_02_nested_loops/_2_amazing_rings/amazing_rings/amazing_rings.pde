int x = 1;
int xx = 1;
void setup() {
  size(1000,500);
  background(255,255,255);
  
}

void draw() {
  background(255);

  
 
  
  for (int i = 300; i >= 0; i-=15) {
     if (i % 2 == 0) {
       noFill();
     }
     else {
       noFill();
     }
     ellipse(x,250,i,i);
  
  }
 
  for (int i = 300; i >= 0; i-=15) {
     if (i % 2 == 0) {
       noFill();
     }
     else {
       noFill();
     }
     ellipse(1000 + xx,250,i,i);
     
  }   
  
  x+= 1;
  xx-=1;


  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
