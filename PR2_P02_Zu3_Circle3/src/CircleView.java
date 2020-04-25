import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleView extends JFrame implements MouseListener {
	private JPanel panel;

	private Circle c;

	public CircleView() {
		c = new Circle(-10, -10, 10);
		setLayout (new FlowLayout());
		panel = new JPanel();
		add(panel);

		addMouseListener(this);
		
	}

	public void paint(Graphics g) {
		int x0 = new Double(c.x).intValue();
		int y0 = new Double(c.y).intValue();
		int durchmesser = new Double(c.durchmesser()).intValue();

		g.fillOval(x0, y0, durchmesser, durchmesser);
	}

	public void mousePressed(MouseEvent e) {
		c.x = e.getX();
		c.y = e.getY();
		Graphics g = getGraphics();
		paint(g);
	}

	public void mouseClicked(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

	public void mouseDragged(MouseEvent e) {}

	public void mouseMoved(MouseEvent e) {}

	// Main
	public static void main(String[] args) {
		JFrame f = new CircleView();
		f.setSize(500, 500);
		f.setVisible(true);	
	}
}
