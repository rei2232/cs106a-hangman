
import acm.graphics.GMath;

import acm.program.GraphicsProgram;
import acm.graphics.*;

public class RandomShapes extends GraphicsProgram{
public void run() {
	
	addMouseListeners();
	addKeyListeners();
	
}
public void keyPressed(KeyEvent e) {
	
		switch(e.getKeyCode()) {
		case KeyEvent.s: createStar();
		break;
		case KeyEvent.c: createCircle();
		break;
		case KEyEvent.r: createRect();
		break;
		
		}
		
	
}
private GPolygon  createStar(double x,double y,double size) {
	GPolygon star = new GPolygon();
	double sinTheta = GMath.sinDegrees(18);
    double b = 0.5 * sinTheta / (1.0 + sinTheta);
    double edge = (0.5 - b) * size;
    star.addVertex(-size / 2, -b * size);
    int angle = 0;
    for (int i = 0; i < 5; i++) {
       star.addPolarEdge(edge, angle);
       star.addPolarEdge(edge, angle + 72);
       angle -= 72;
    }
    private GOval createCircle(double x,double y, double r ) {
    	GOval circle = new GOval(x,y,r,r);
    	add(circle);
    	
    }
    private Grect createRect(double x, double y,double width,double height) {
    	GRect rect = new GRect(x,y,width,height);
    	add(rect);
    }
}
	
}
	


