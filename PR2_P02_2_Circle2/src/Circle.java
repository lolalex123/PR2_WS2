public class Circle
{
	public double x, y;		// Koordinaten des Mittelpunkts
	public double r;		// Radius

	// Konstruktor
	public Circle (double x, double y, double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double durchmesser ()
	{
		return 2 * r;
	}

	public static void main (String args[])
	{
		Circle c = new Circle (0.0, 0.0, 0.5);
		double d = c.durchmesser ();
		System.out.println ("r=" + c.r + ", d=" + d);
	}
}
