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

	// Konstruktor
	public Circle (double r)
	{
		this (0.0, 0.0, r);
	}

	public double durchmesser ()
	{
		return 2 * r;
	}

	public double umfang ()
	{
		return 2 * Math.PI * r;
	}

	public double flaeche ()
	{
		return Math.PI * r * r;
	}
}
