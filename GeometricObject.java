public abstract class GeometricObject {
	private String color = "while";
	private boolean filled;

	protected GeometricObject() {
	}

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	@Override
	public String toString() {
		return  "\nColor: " + color +
			"\nfilled: " + filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}