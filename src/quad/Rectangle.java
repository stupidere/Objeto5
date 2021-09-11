package quad;

public class Rectangle {

	public int x;
	public int y;
	public int w;
	public int h;
	
	
	public Rectangle(int _x, int _y, int _w, int _h) {
		this.x = _x;
		this.y = _y;
		this.w = _w;
		this.h = _h;
	}
	
	
	public boolean Contains(Points points) {
		return(points.x > this.x - this.w &&
				points.x < this.x + this.w &&
				points.y > this.y - this.h &&
				points.y < this.y + this.h);
	}

}
