
public class Circle extends MyShape {
	
	static{
		pi=3.14f;
	}
	private static float  pi;
	 private int radius;
	 private float area;
	 
	public Circle(int radius) {
		
		this.radius = radius;
		
	}
	public void area(){
		area=radius*radius*pi;
	}
	@Override
	public String toString() {
		return "Circle [area=" + area + "]";
	}
	
}
