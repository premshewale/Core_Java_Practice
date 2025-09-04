
public class CircleArea {
private float radius,pi,area;
public void initValue(float n1,float n2){
	radius=n1;
	pi=n2;
	}
public float calculateArea(){
	area=radius*radius*pi;
	return area;
}
public void displayCircleArea(){
	System.out.println("Radius="+radius);
	System.out.println("pi="+pi);
	System.out.println("area="+area);
}
}
