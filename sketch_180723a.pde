import processing.opengl.*;

void setup() {
    size(400, 400, OPENGL);
    noStroke();
    fill(255,190);
}

void draw() {
    background(0);
    translate(width / 2, height / 2, 0);

    //マウスの位置で座標全体を回転する
    rotateX(mouseX / 200.0);
    rotateY(mouseY / 100.0);

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
