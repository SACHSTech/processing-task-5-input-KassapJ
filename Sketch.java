import processing.core.PApplet;

public class Sketch extends PApplet {
	
    
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1280, 720);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(150);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // emergency button
    stroke(2);
    fill(255);
	  ellipse(width / 2, height / 2, width / 2, height / 4);
    fill(255, 0, 0);
    ellipse(width / 2, height / 2, width / 12, height / 12);
    
    //background window
    fill(0);
    rect(width / 4, height / 10, width/ 2, height / 4);

  }

  public void mousePressed(){
    //random scale
    float scale = random(0, 200);
    float legDistanceY = (float) (scale * 1.5);
    float legSlightMove = scale / 8;
    float backpackDistanceX = scale / 5;
    float backpackDistanceY = scale / 4;
    float maskDistanceY = scale / 3;
  //among us #1
	noStroke();
	fill(random(0, 255),random(0, 255),random(0, 255));
	//body
	rect(mouseX, mouseY, scale, (float) (scale * 1.5));
	//round head
	ellipse((float) (mouseX+ scale/2), mouseY, scale, (float) (scale * 0.5));
	//legs
	ellipse((float) (mouseX + legSlightMove), mouseY + legDistanceY, scale / 4, scale / 2);
	ellipse((float) (mouseX - legSlightMove)+ scale, mouseY + legDistanceY, scale / 4, scale / 2);
	//backpack
	rect(mouseX - backpackDistanceX , mouseY + backpackDistanceY, scale, scale);
	//mask
	stroke(0);
	strokeWeight(scale / 50);
	fill(149,202,220);
	ellipse(mouseX + scale, mouseY + maskDistanceY, (float) (scale * 0.75), (float) (scale * 0.5));
  }


  public void keyPressed(){
    String sus = "sus";
    String capSUS = "SUSSUSUSUSUSS";
    textSize(random(50, 150));
    if(key == 's'){
      text(capSUS, random(0, width), random(0, height));
    }
    else{
      text(sus, random(0, width), random(0, height));
    }
  }
  
  // define other methods down here.
}