package quad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	
	
	int cWidth = 600;
	int cHeight = 600;
	Rectangle rect = new Rectangle(1, 1, cWidth, cHeight);
	QuadTree qTree = new QuadTree(rect, 4);
	List<QuadTree> qdTrs = new ArrayList<>();
	Points[] points;
	int qty;
	
	Random rand = new Random();
	
	public Canvas() {
		points = new Points[qty];
		
		for (int i = 0; i < qty; i++) {
			Points pointSpace = new Points(rand.nextInt(cWidth - 1), rand.nextInt(cHeight - 1) + 3);
			points[i] = pointSpace;
			
			
		}
		
		
		
	}

}
