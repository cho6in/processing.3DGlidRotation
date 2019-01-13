import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_180723a extends PApplet {



public void setup() {
    
    noStroke();
    fill(255,190);
}

public void draw() {
    background(0);
    translate(width / 2, height / 2, 0);

    //マウスの位置で座標全体を回転する
    rotateX(mouseX / 200.0f);
    rotateY(mouseY / 100.0f);

    //四角形描画を中心を原点に
    rectMode(CENTER);

    //敷きつめるタイルの一片の長さ
    int dim = 18;

    //XY平面を正方形でタイリング
    for(int i = -height/2; i < height/2; i += dim) {
    	for(int j = -width/2; j < width/2; j += dim) {
    	    pushMatrix();
    	    translate(i,j);
    	    rotateX(radians(50));
    	    rotateY(radians(30));
    	    rect(0,0,dim,dim);
    	    popMatrix();

    	}
    }
}
  public void settings() {  size(400, 400, OPENGL); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180723a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
