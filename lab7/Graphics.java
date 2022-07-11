import javax.swing.*;

protected Graphics() g;

@Override
protected void paintComponent(Graphics g)
{
	super.paintComponent(g);
	g.setColor(Color.RED);
	g.fillRect(0, 0, 10, 7);
}