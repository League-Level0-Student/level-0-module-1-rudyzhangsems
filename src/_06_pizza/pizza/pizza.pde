
void setup() {
    size (1000, 1000);
       fill(#D69811);
ellipse(500, 500, 945, 945);
    fill(#F70F02);
ellipse(500, 500, 885, 885);
    fill(#FFF598);
ellipse(500, 500, 855, 855);
}
void draw() {
  if(mouseButton==LEFT)  {
    fill(#391E02);
    rect(mouseX-5, mouseY, 10, 25);
ellipse(mouseX+8, mouseY, 35, 25);
ellipse(mouseX-8, mouseY, 35, 25);
ellipse(mouseX, mouseY, 35, 25);
}
  else if(mouseButton==RIGHT){
     fill(#FFF300);
    rect(mouseX, mouseY, 25, 55);
    
  }
}
