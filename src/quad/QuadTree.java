package quad;

import java.util.ArrayList;
import java.util.List;

public class QuadTree {

	List<Points> points = new ArrayList<Points>();
	int capacity;
	Rectangle rect;
	boolean divided = false;
	
	public QuadTree nw;
	public QuadTree ne;
	public QuadTree sw;
	public QuadTree se;
	
	
	public QuadTree(Rectangle _rect, int _capacity) {
		this.rect = _rect;
		this.capacity = _capacity;
	}
	
	
	
}
